package de.ollie.carp.cm.cp.red.print.jasper;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.TpService;
import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.exception.PrintReportException;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
import de.ollie.carp.cm.cp.red.core.service.port.print.PrintPort;
import de.ollie.carp.cm.cp.red.print.jasper.po.FertigkeitPO;
import de.ollie.carp.cm.cp.red.print.jasper.po.PunkPO;
import jakarta.inject.Named;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lombok.RequiredArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Named
@RequiredArgsConstructor
class JasperPrintAdapter implements PrintPort {

	private final AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService;
	private final CyberwarePunkService cyberwarePunkService;
	private final JasperConfiguration jasperConfiguration;
	private final EigenschaftPunkService eigenschaftPunkService;
	private final FertigkeitPunkService fertigkeitPunkService;
	private final TpService tpService;
	private final WaffePunkService waffePunkService;

	@Override
	public Details getDetails() {
		return new Details("jasper", "Jasper Reports Printing");
	}

	@Override
	public byte[] print(Punk punk, Map<String, Object> parameters) {
		String jasperPath = jasperConfiguration.getJasperPath();
		try (ByteArrayOutputStream pdfReportStream = new ByteArrayOutputStream()) {
			parameters.put("SUBREPORT_DIR", "./jasper-print/src/main/resources/jasper/src/");
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Arrays.asList(mapToPO(punk)), true);
			JasperPrint document = createDocument(jasperPath, dataSource, parameters);
			JasperExportManager.exportReportToPdfStream(document, pdfReportStream);
			return pdfReportStream.toByteArray();
		} catch (Exception e) {
			throw new PrintReportException(e.getMessage(), e);
		}
	}

	private PunkPO mapToPO(Punk punk) {
		List<AusruestungsgegenstandPunk> ausruestungsgegenstaende = getAusruestungsgegenstaende(punk);
		List<CyberwarePunk> cyberware = getCyberware(punk);
		Map<String, Integer> eigenschaften = getEigenschaften(punk);
		List<WaffePunk> waffen = getWaffen(punk);
		int kraft = eigenschaften.get("KRA");
		return new PunkPO()
			.setAnfaenglicheTP("" + tpService.getAnfaenglicheTp(kraft))
			.setAusruestung0Beschreibung(ausruestungsgegenstaende.get(0).getAusruestungsgegenstand().getBeschreibung())
			.setAusruestung0Name(ausruestungsgegenstaende.get(0).getAusruestungsgegenstand().getName())
			.setAusruestung1Beschreibung(ausruestungsgegenstaende.get(1).getAusruestungsgegenstand().getBeschreibung())
			.setAusruestung1Name(ausruestungsgegenstaende.get(1).getAusruestungsgegenstand().getName())
			.setAusruestung2Beschreibung(ausruestungsgegenstaende.get(2).getAusruestungsgegenstand().getBeschreibung())
			.setAusruestung2Name(ausruestungsgegenstaende.get(2).getAusruestungsgegenstand().getName())
			.setAusruestung3Beschreibung(ausruestungsgegenstaende.get(3).getAusruestungsgegenstand().getBeschreibung())
			.setAusruestung3Name(ausruestungsgegenstaende.get(3).getAusruestungsgegenstand().getName())
			.setBewegung("" + eigenschaften.get("BEW"))
			.setCoolness("" + eigenschaften.get("COO"))
			.setCyberware0Beschreibung(cyberware.get(0).getCyberware().getBeschreibung())
			.setCyberware0Name(cyberware.get(0).getCyberware().getName())
			.setCyberware1Beschreibung(cyberware.get(1).getCyberware().getBeschreibung())
			.setCyberware1Name(cyberware.get(1).getCyberware().getName())
			.setCyberware2Beschreibung(cyberware.get(2).getCyberware().getBeschreibung())
			.setCyberware2Name(cyberware.get(2).getCyberware().getName())
			.setCyberware3Beschreibung(cyberware.get(3).getCyberware().getBeschreibung())
			.setCyberware3Name(cyberware.get(3).getCyberware().getName())
			.setEmpathie("" + eigenschaften.get("EMP"))
			.setFertigkeiten(getFertigkeiten(punk))
			.setFreunde(punk.getFreunde())
			.setFeinde(punk.getFeinde())
			.setGeschicklichkeit("" + eigenschaften.get("GES"))
			.setGlueck("" + eigenschaften.get("GLK"))
			.setHintergrund(punk.getHintergrund())
			.setIntelligenz("" + eigenschaften.get("INT"))
			.setKraft("" + eigenschaften.get("KRA"))
			.setLiebschaften(punk.getLiebschaften())
			.setMotivation(punk.getMotivation())
			.setName(punk.getName())
			.setPanzerung(getPanzerung(punk))
			.setPersoenlichkeit(punk.getPersoenlichkeit())
			.setReflexe("" + eigenschaften.get("REF"))
			.setSchwerVerwundet("" + tpService.getSchwertVerwundet(kraft))
			.setSwKoerper(punk.getPanzerungKoerper() != null ? "" + punk.getPanzerungKoerper().getSw() : null)
			.setSwKopf(punk.getPanzerungKopf() != null ? "" + punk.getPanzerungKopf().getSw() : null)
			.setTech("" + eigenschaften.get("TCH"))
			.setTraumaprobe("" + tpService.getTraumaprobe(kraft))
			.setWaffe0Name(waffen.get(0).getWaffe().getName())
			.setWaffe0Schaden(waffen.get(0).getWaffe().getSchaden())
			.setWaffe1Name(waffen.get(1).getWaffe().getName())
			.setWaffe1Schaden(waffen.get(1).getWaffe().getSchaden())
			.setWaffe2Name(waffen.get(2).getWaffe().getName())
			.setWaffe2Schaden(waffen.get(2).getWaffe().getSchaden())
			.setWaffe3Name(waffen.get(3).getWaffe().getName())
			.setWaffe3Schaden(waffen.get(3).getWaffe().getSchaden())
			.setWille("" + eigenschaften.get("WIL"))
			.setZiele(punk.getZiele());
	}

	private List<AusruestungsgegenstandPunk> getAusruestungsgegenstaende(Punk punk) {
		List<AusruestungsgegenstandPunk> l = new ArrayList<>(
			ausruestungsgegenstandPunkService
				.findAllByPunk(punk)
				.stream()
				.sorted((a0, a1) -> a0.getAusruestungsgegenstand().getName().compareTo(a1.getAusruestungsgegenstand().getName())
				)
				.toList()
		);
		while (l.size() < 4) {
			l.add(
				new AusruestungsgegenstandPunk()
					.setPunk(punk)
					.setAusruestungsgegenstand(new Ausruestungsgegenstand().setBeschreibung("").setName(""))
			);
		}
		return l;
	}

	private List<CyberwarePunk> getCyberware(Punk punk) {
		List<CyberwarePunk> l = new ArrayList<>(
			cyberwarePunkService
				.findAllByPunk(punk)
				.stream()
				.sorted((a0, a1) -> a0.getCyberware().getName().compareTo(a1.getCyberware().getName()))
				.toList()
		);
		while (l.size() < 4) {
			l.add(new CyberwarePunk().setPunk(punk).setCyberware(new Cyberware().setBeschreibung("").setName("")));
		}
		return l;
	}

	private Map<String, Integer> getEigenschaften(Punk punk) {
		Map<String, Integer> m = new HashMap<>();
		for (Entry<Eigenschaft, EigenschaftPunk> e : eigenschaftPunkService.findAllByPunk(punk).entrySet()) {
			m.put(e.getKey().getName(), e.getValue().getWert());
		}
		return m;
	}

	private List<FertigkeitPO> getFertigkeiten(Punk punk) {
		List<FertigkeitPO> v = new ArrayList<>();
		fertigkeitPunkService
			.findAllByPunk(punk)
			.forEach(fp ->
				v.add(
					new FertigkeitPO()
						.setEigenschaft(fp.getFertigkeit().getEigenschaft().getName())
						.setName(fp.getFertigkeit().getName())
						.setWert("" + fp.getWert())
				)
			);
		return v;
	}

	private String getPanzerung(Punk punk) {
		String panzerung = punk.getPanzerungKoerper() != null ? punk.getPanzerungKoerper().getName() : "";
		if (!punk.getPanzerungKoerper().equals(punk.getPanzerungKopf())) {
			panzerung +=
				((punk.getPanzerungKoerper() != null) && (punk.getPanzerungKopf() != null) ? ", " : "") +
				(punk.getPanzerungKopf() != null ? punk.getPanzerungKopf().getName() : "");
		}
		return panzerung;
	}

	private List<WaffePunk> getWaffen(Punk punk) {
		List<WaffePunk> l = new ArrayList<>(waffePunkService.findAllByPunk(punk));
		while (l.size() < 4) {
			l.add(new WaffePunk().setPunk(punk).setWaffe(new Waffe().setName("").setSchaden("")));
		}
		return l;
	}

	private JasperPrint createDocument(
		String jasperPath,
		JRBeanCollectionDataSource dataSource,
		Map<String, Object> parameters
	) throws JRException {
		return JasperFillManager.fillReport(
			jasperPath + "Charakterbogen-Cyberpunk-Red-Einfach.jasper",
			parameters,
			dataSource
		);
	}
}

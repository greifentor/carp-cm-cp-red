package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.UuidFactory;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.AusruestungsgegenstandDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.AusruestungsgegenstandPunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.CyberwareDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.CyberwarePunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.EigenschaftDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.EigenschaftPunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.FertigkeitDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.FertigkeitPunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PanzerungDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.RolleDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.RollePunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.WaffeDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.WaffePunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.AusruestungsgegenstandDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.AusruestungsgegenstandPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.CyberwareDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.CyberwarePunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.EigenschaftDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.EigenschaftPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.FertigkeitDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.FertigkeitPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PanzerungDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.RolleDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.RollePunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.WaffeDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.WaffePunkDboRepository;
import jakarta.inject.Named;
import java.util.NoSuchElementException;
import java.util.UUID;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
@Named
@RequiredArgsConstructor
public class DboFactory {

	private final AusruestungsgegenstandDboRepository ausruestungsgegenstandDboRepository;
	private final AusruestungsgegenstandPunkDboRepository ausruestungsgegenstandPunkDboRepository;
	private final CyberwareDboRepository cyberwareDboRepository;
	private final CyberwarePunkDboRepository cyberwarePunkDboRepository;
	private final EigenschaftDboRepository eigenschaftDboRepository;
	private final EigenschaftPunkDboRepository eigenschaftPunkDboRepository;
	private final FertigkeitDboRepository fertigkeitDboRepository;
	private final FertigkeitPunkDboRepository fertigkeitPunkDboRepository;
	private final PanzerungDboRepository panzerungDboRepository;
	private final PunkDboRepository punkDboRepository;
	private final RolleDboRepository rolleDboRepository;
	private final RollePunkDboRepository rollePunkDboRepository;
	private final WaffeDboRepository waffeDboRepository;
	private final WaffePunkDboRepository waffePunkDboRepository;
	private final UuidFactory uuidFactory;

	public AusruestungsgegenstandDbo createAusruestungsgegenstand(String beschreibung, String name) {
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		return new AusruestungsgegenstandDbo().setBeschreibung(beschreibung).setName(name).setId(uuidFactory.create());
	}

	public AusruestungsgegenstandPunkDbo createAusruestungsgegenstandPunk(UUID ausruestungsgegenstandId, UUID punkId) {
		ensure(ausruestungsgegenstandId != null, "ausruestungsgegenstand cannot be null!");
		ensure(punkId != null, "punk cannot be null!");
		AusruestungsgegenstandDbo ausruestungsgegenstandDbo = ausruestungsgegenstandDboRepository
			.findById(ausruestungsgegenstandId)
			.orElseThrow(() ->
				new NoSuchElementException("no ausruestungsgegenstand found with id: " + ausruestungsgegenstandId)
			);
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		return new AusruestungsgegenstandPunkDbo()
			.setAusruestungsgegenstand(ausruestungsgegenstandDbo)
			.setPunk(punkDbo)
			.setId(uuidFactory.create());
	}

	public CyberwareDbo createCyberware(String beschreibung, String name) {
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		return new CyberwareDbo().setBeschreibung(beschreibung).setName(name).setId(uuidFactory.create());
	}

	public CyberwarePunkDbo createCyberwarePunk(UUID cyberwareId, UUID punkId) {
		ensure(cyberwareId != null, "cyberware cannot be null!");
		ensure(punkId != null, "punk cannot be null!");
		CyberwareDbo cyberwareDbo = cyberwareDboRepository
			.findById(cyberwareId)
			.orElseThrow(() -> new NoSuchElementException("no cyberware found with id: " + cyberwareId));
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		return new CyberwarePunkDbo().setCyberware(cyberwareDbo).setPunk(punkDbo).setId(uuidFactory.create());
	}

	public EigenschaftDbo createEigenschaft(String name) {
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		return new EigenschaftDbo().setName(name).setId(uuidFactory.create());
	}

	public EigenschaftPunkDbo createEigenschaftPunk(UUID eigenschaftId, UUID punkId, int wert) {
		ensure(eigenschaftId != null, "eigenschaft cannot be null!");
		ensure(punkId != null, "punk cannot be null!");
		EigenschaftDbo eigenschaftDbo = eigenschaftDboRepository
			.findById(eigenschaftId)
			.orElseThrow(() -> new NoSuchElementException("no eigenschaft found with id: " + eigenschaftId));
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		return new EigenschaftPunkDbo()
			.setEigenschaft(eigenschaftDbo)
			.setPunk(punkDbo)
			.setWert(wert)
			.setId(uuidFactory.create());
	}

	public FertigkeitDbo createFertigkeit(UUID eigenschaftId, String name, boolean rollenfertigkeit) {
		ensure(eigenschaftId != null, "eigenschaft cannot be null!");
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		EigenschaftDbo eigenschaftDbo = eigenschaftDboRepository
			.findById(eigenschaftId)
			.orElseThrow(() -> new NoSuchElementException("no eigenschaft found with id: " + eigenschaftId));
		return new FertigkeitDbo()
			.setEigenschaft(eigenschaftDbo)
			.setName(name)
			.setRollenfertigkeit(rollenfertigkeit)
			.setId(uuidFactory.create());
	}

	public FertigkeitPunkDbo createFertigkeitPunk(UUID fertigkeitId, UUID punkId, int wert) {
		ensure(fertigkeitId != null, "fertigkeit cannot be null!");
		ensure(punkId != null, "punk cannot be null!");
		FertigkeitDbo fertigkeitDbo = fertigkeitDboRepository
			.findById(fertigkeitId)
			.orElseThrow(() -> new NoSuchElementException("no fertigkeit found with id: " + fertigkeitId));
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		return new FertigkeitPunkDbo()
			.setFertigkeit(fertigkeitDbo)
			.setPunk(punkDbo)
			.setWert(wert)
			.setId(uuidFactory.create());
	}

	public PanzerungDbo createPanzerung(boolean koerperpanzerung, String name, int sw) {
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		return new PanzerungDbo().setKoerperpanzerung(koerperpanzerung).setName(name).setSw(sw).setId(uuidFactory.create());
	}

	public PunkDbo createPunk(
		String feinde,
		String freunde,
		String hintergrund,
		String liebschaften,
		String motivation,
		String name,
		UUID panzerungKoerperId,
		UUID panzerungKopfId,
		String persoenlichkeit,
		int euroBar,
		int euroKonto,
		int lpOffen,
		String ziele
	) {
		ensure(feinde != null, "feinde cannot be null!");
		ensure(!feinde.isBlank(), "feinde cannot be blank!");
		ensure(freunde != null, "freunde cannot be null!");
		ensure(!freunde.isBlank(), "freunde cannot be blank!");
		ensure(hintergrund != null, "hintergrund cannot be null!");
		ensure(!hintergrund.isBlank(), "hintergrund cannot be blank!");
		ensure(liebschaften != null, "liebschaften cannot be null!");
		ensure(!liebschaften.isBlank(), "liebschaften cannot be blank!");
		ensure(motivation != null, "motivation cannot be null!");
		ensure(!motivation.isBlank(), "motivation cannot be blank!");
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		ensure(persoenlichkeit != null, "persoenlichkeit cannot be null!");
		ensure(!persoenlichkeit.isBlank(), "persoenlichkeit cannot be blank!");
		ensure(ziele != null, "ziele cannot be null!");
		ensure(!ziele.isBlank(), "ziele cannot be blank!");
		PanzerungDbo panzerungKoerperDbo = panzerungDboRepository.findById(panzerungKoerperId).orElse(null);
		PanzerungDbo panzerungKopfDbo = panzerungDboRepository.findById(panzerungKopfId).orElse(null);
		return new PunkDbo()
			.setFeinde(feinde)
			.setFreunde(freunde)
			.setHintergrund(hintergrund)
			.setLiebschaften(liebschaften)
			.setMotivation(motivation)
			.setName(name)
			.setPanzerungKoerper(panzerungKoerperDbo)
			.setPanzerungKopf(panzerungKopfDbo)
			.setPersoenlichkeit(persoenlichkeit)
			.setEuroBar(euroBar)
			.setEuroKonto(euroKonto)
			.setLpOffen(lpOffen)
			.setZiele(ziele)
			.setId(uuidFactory.create());
	}

	public RolleDbo createRolle(String name, UUID rollenfertigkeitId) {
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		ensure(rollenfertigkeitId != null, "rollenfertigkeit cannot be null!");
		FertigkeitDbo rollenfertigkeitDbo = fertigkeitDboRepository
			.findById(rollenfertigkeitId)
			.orElseThrow(() -> new NoSuchElementException("no rollenfertigkeit found with id: " + rollenfertigkeitId));
		return new RolleDbo().setName(name).setRollenfertigkeit(rollenfertigkeitDbo).setId(uuidFactory.create());
	}

	public RollePunkDbo createRollePunk(UUID punkId, UUID rolleId) {
		ensure(punkId != null, "punk cannot be null!");
		ensure(rolleId != null, "rolle cannot be null!");
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		RolleDbo rolleDbo = rolleDboRepository
			.findById(rolleId)
			.orElseThrow(() -> new NoSuchElementException("no rolle found with id: " + rolleId));
		return new RollePunkDbo().setPunk(punkDbo).setRolle(rolleDbo).setId(uuidFactory.create());
	}

	public WaffeDbo createWaffe(UUID fertigkeitId, String name, String schaden) {
		ensure(fertigkeitId != null, "fertigkeit cannot be null!");
		ensure(name != null, "name cannot be null!");
		ensure(!name.isBlank(), "name cannot be blank!");
		ensure(schaden != null, "schaden cannot be null!");
		ensure(!schaden.isBlank(), "schaden cannot be blank!");
		FertigkeitDbo fertigkeitDbo = fertigkeitDboRepository
			.findById(fertigkeitId)
			.orElseThrow(() -> new NoSuchElementException("no fertigkeit found with id: " + fertigkeitId));
		return new WaffeDbo().setFertigkeit(fertigkeitDbo).setName(name).setSchaden(schaden).setId(uuidFactory.create());
	}

	public WaffePunkDbo createWaffePunk(UUID punkId, UUID waffeId) {
		ensure(punkId != null, "punk cannot be null!");
		ensure(waffeId != null, "waffe cannot be null!");
		PunkDbo punkDbo = punkDboRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("no punk found with id: " + punkId));
		WaffeDbo waffeDbo = waffeDboRepository
			.findById(waffeId)
			.orElseThrow(() -> new NoSuchElementException("no waffe found with id: " + waffeId));
		return new WaffePunkDbo().setPunk(punkDbo).setWaffe(waffeDbo).setId(uuidFactory.create());
	}
}

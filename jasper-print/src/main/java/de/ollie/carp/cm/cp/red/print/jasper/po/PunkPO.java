package de.ollie.carp.cm.cp.red.print.jasper.po;

import java.util.Vector;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
@NoArgsConstructor
public class PunkPO {

	private String anfaenglicheTP;
	private String ausruestung0Beschreibung;
	private String ausruestung0Name;
	private String ausruestung1Beschreibung;
	private String ausruestung1Name;
	private String ausruestung2Beschreibung;
	private String ausruestung2Name;
	private String ausruestung3Beschreibung;
	private String ausruestung3Name;
	private String bewegung;
	private String coolness;
	private String cyberware0Beschreibung;
	private String cyberware0Name;
	private String cyberware1Beschreibung;
	private String cyberware1Name;
	private String cyberware2Beschreibung;
	private String cyberware2Name;
	private String cyberware3Beschreibung;
	private String cyberware3Name;
	private String empathie;
	private String geschicklichkeit;
	private String feinde;
	private Vector<String> fertigkeiten;
	private String freunde;
	private String glueck;
	private String hintergrund;
	private String intelligenz;
	private String kraft;
	private String liebschaften;
	private String motivation;
	private String name;
	private String panzerung;
	private String persoenlichkeit;
	private String reflexe;
	private String schwerVerwundet;
	private String swKoerper;
	private String swKopf;
	private String tech;
	private String traumaprobe;
	private String waffe0Name;
	private String waffe0Schaden;
	private String waffe1Name;
	private String waffe1Schaden;
	private String waffe2Name;
	private String waffe2Schaden;
	private String waffe3Name;
	private String waffe3Schaden;
	private String wille;
	private String ziele;
}

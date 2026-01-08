package de.ollie.carp.cm.cp.red.gui.swing.print.pdf.viewer;

import jakarta.inject.Named;

@Named
class ProcessBuilderFactory {

	ProcessBuilder create(String command, String parameters) {
		return new ProcessBuilder(command, parameters);
	}
}

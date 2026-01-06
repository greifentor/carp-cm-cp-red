package de.ollie.carp.cm.cp.red.gui.swing.impl;

import de.ollie.carp.cm.cp.red.gui.swing.ComponentFactory;
import jakarta.inject.Named;
import javax.swing.JButton;

@Named
class ComponentFactoryImpl implements ComponentFactory {

	@Override
	public JButton createButton(String label) {
		return new JButton(label);
	}
}

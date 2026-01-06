package de.ollie.carp.cm.cp.red.gui.swing;

import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditJInternalFrame.Observer;
import javax.swing.JButton;

public interface EditDialogComponentFactory {
	<T> JButton createSaveButton(Observer<T> observer, AbstractEditJInternalFrame<T> dialog);
}

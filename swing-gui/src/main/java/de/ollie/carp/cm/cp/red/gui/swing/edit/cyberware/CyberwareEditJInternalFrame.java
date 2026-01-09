package de.ollie.carp.cm.cp.red.gui.swing.edit.cyberware;

import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditJInternalFrame;
import java.util.Map;
import java.util.UUID;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class CyberwareEditJInternalFrame extends AbstractEditJInternalFrame<Cyberware> {

	public CyberwareEditJInternalFrame(
		Cyberware toEdit,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Cyberware> observer,
		JDesktopPane desktopPane
	) {
		super(desktopPane, "Cyberware", toEdit, editDialogComponentFactory, observer, Map.of());
	}

	@Override
	protected JPanel createEditorPanel(Cyberware toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new CyberwareEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

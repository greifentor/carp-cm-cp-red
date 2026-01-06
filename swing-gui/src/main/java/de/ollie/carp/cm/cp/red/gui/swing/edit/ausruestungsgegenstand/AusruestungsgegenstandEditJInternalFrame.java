package de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstand;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
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
public class AusruestungsgegenstandEditJInternalFrame extends AbstractEditJInternalFrame<Ausruestungsgegenstand> {

	public AusruestungsgegenstandEditJInternalFrame(
		Ausruestungsgegenstand toEdit,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Ausruestungsgegenstand> observer,
		JDesktopPane desktopPane
	) {
		super(desktopPane, "Ausruestungsgegenstand", toEdit, editDialogComponentFactory, observer, Map.of());
	}

	@Override
	protected JPanel createEditorPanel(Ausruestungsgegenstand toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new AusruestungsgegenstandEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

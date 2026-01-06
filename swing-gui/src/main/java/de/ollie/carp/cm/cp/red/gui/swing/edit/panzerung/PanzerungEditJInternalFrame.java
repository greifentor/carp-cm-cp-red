package de.ollie.carp.cm.cp.red.gui.swing.edit.panzerung;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
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
public class PanzerungEditJInternalFrame extends AbstractEditJInternalFrame<Panzerung> {

	public PanzerungEditJInternalFrame(
		Panzerung toEdit,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Panzerung> observer,
		JDesktopPane desktopPane
	) {
		super(desktopPane, "Panzerung", toEdit, editDialogComponentFactory, observer, Map.of());
	}

	@Override
	protected JPanel createEditorPanel(Panzerung toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new PanzerungEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

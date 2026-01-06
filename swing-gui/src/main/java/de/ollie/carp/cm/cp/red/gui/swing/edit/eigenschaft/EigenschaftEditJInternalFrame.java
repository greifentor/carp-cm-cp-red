package de.ollie.carp.cm.cp.red.gui.swing.edit.eigenschaft;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
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
public class EigenschaftEditJInternalFrame extends AbstractEditJInternalFrame<Eigenschaft> {

	public EigenschaftEditJInternalFrame(
		Eigenschaft toEdit,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Eigenschaft> observer,
		JDesktopPane desktopPane
	) {
		super(desktopPane, "Eigenschaft", toEdit, editDialogComponentFactory, observer, Map.of());
	}

	@Override
	protected JPanel createEditorPanel(Eigenschaft toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new EigenschaftEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

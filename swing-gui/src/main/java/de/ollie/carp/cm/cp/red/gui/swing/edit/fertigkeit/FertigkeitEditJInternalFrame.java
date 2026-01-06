package de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeit;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
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
public class FertigkeitEditJInternalFrame extends AbstractEditJInternalFrame<Fertigkeit> {

	public FertigkeitEditJInternalFrame(
		Fertigkeit toEdit,
		ItemProvider<Eigenschaft> eigenschafts,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Fertigkeit> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Fertigkeit",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(FertigkeitEditJPanel.EIGENSCHAFT_ITEM_PROVIDER_ID, eigenschafts)
		);
	}

	@Override
	protected JPanel createEditorPanel(Fertigkeit toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new FertigkeitEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

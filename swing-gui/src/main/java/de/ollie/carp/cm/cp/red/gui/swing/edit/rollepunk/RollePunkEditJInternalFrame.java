package de.ollie.carp.cm.cp.red.gui.swing.edit.rollepunk;

import de.ollie.carp.cm.cp.red.core.service.RollePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
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
public class RollePunkEditJInternalFrame extends AbstractEditJInternalFrame<RollePunk> {

	public RollePunkEditJInternalFrame(
		RollePunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Rolle> rolles,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<RollePunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Rolle Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(RollePunkEditJPanel.PUNK_ITEM_PROVIDER_ID, punks, RollePunkEditJPanel.ROLLE_ITEM_PROVIDER_ID, rolles)
		);
	}

	@Override
	protected JPanel createEditorPanel(RollePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new RollePunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

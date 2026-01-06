package de.ollie.carp.cm.cp.red.gui.swing.edit.rolle;

import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
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
public class RolleEditJInternalFrame extends AbstractEditJInternalFrame<Rolle> {

	public RolleEditJInternalFrame(
		Rolle toEdit,
		ItemProvider<Fertigkeit> fertigkeits,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Rolle> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Rolle",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(RolleEditJPanel.FERTIGKEIT_ITEM_PROVIDER_ID, fertigkeits)
		);
	}

	@Override
	protected JPanel createEditorPanel(Rolle toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new RolleEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

package de.ollie.carp.cm.cp.red.gui.swing.edit.waffepunk;

import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
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
public class WaffePunkEditJInternalFrame extends AbstractEditJInternalFrame<WaffePunk> {

	public WaffePunkEditJInternalFrame(
		WaffePunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Waffe> waffes,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<WaffePunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Waffe Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(WaffePunkEditJPanel.PUNK_ITEM_PROVIDER_ID, punks, WaffePunkEditJPanel.WAFFE_ITEM_PROVIDER_ID, waffes)
		);
	}

	@Override
	protected JPanel createEditorPanel(WaffePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new WaffePunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

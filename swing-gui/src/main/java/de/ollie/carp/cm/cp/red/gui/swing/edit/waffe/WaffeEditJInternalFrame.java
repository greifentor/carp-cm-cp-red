package de.ollie.carp.cm.cp.red.gui.swing.edit.waffe;

import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
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
public class WaffeEditJInternalFrame extends AbstractEditJInternalFrame<Waffe> {

	public WaffeEditJInternalFrame(
		Waffe toEdit,
		ItemProvider<Fertigkeit> fertigkeits,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Waffe> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Waffe",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(WaffeEditJPanel.FERTIGKEIT_ITEM_PROVIDER_ID, fertigkeits)
		);
	}

	@Override
	protected JPanel createEditorPanel(Waffe toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new WaffeEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

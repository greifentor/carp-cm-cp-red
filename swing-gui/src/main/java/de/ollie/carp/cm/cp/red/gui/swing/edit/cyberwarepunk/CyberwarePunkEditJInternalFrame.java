package de.ollie.carp.cm.cp.red.gui.swing.edit.cyberwarepunk;

import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
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
public class CyberwarePunkEditJInternalFrame extends AbstractEditJInternalFrame<CyberwarePunk> {

	public CyberwarePunkEditJInternalFrame(
		CyberwarePunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Cyberware> cyberwares,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<CyberwarePunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Cyberware Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(
				CyberwarePunkEditJPanel.PUNK_ITEM_PROVIDER_ID,
				punks,
				CyberwarePunkEditJPanel.CYBERWARE_ITEM_PROVIDER_ID,
				cyberwares
			)
		);
	}

	@Override
	protected JPanel createEditorPanel(CyberwarePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new CyberwarePunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

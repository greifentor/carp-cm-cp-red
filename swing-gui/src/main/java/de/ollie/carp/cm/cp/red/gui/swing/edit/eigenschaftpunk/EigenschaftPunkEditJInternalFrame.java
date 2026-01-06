package de.ollie.carp.cm.cp.red.gui.swing.edit.eigenschaftpunk;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
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
public class EigenschaftPunkEditJInternalFrame extends AbstractEditJInternalFrame<EigenschaftPunk> {

	public EigenschaftPunkEditJInternalFrame(
		EigenschaftPunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Eigenschaft> eigenschafts,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<EigenschaftPunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Eigenschaft Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(
				EigenschaftPunkEditJPanel.PUNK_ITEM_PROVIDER_ID,
				punks,
				EigenschaftPunkEditJPanel.EIGENSCHAFT_ITEM_PROVIDER_ID,
				eigenschafts
			)
		);
	}

	@Override
	protected JPanel createEditorPanel(EigenschaftPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new EigenschaftPunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

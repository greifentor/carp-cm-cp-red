package de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeitpunk;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
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
public class FertigkeitPunkEditJInternalFrame extends AbstractEditJInternalFrame<FertigkeitPunk> {

	public FertigkeitPunkEditJInternalFrame(
		FertigkeitPunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Fertigkeit> fertigkeits,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<FertigkeitPunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Fertigkeit Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(
				FertigkeitPunkEditJPanel.PUNK_ITEM_PROVIDER_ID,
				punks,
				FertigkeitPunkEditJPanel.FERTIGKEIT_ITEM_PROVIDER_ID,
				fertigkeits
			)
		);
	}

	@Override
	protected JPanel createEditorPanel(FertigkeitPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new FertigkeitPunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

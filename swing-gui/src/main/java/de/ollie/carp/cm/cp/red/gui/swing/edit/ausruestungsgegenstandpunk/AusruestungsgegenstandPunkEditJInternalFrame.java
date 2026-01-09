package de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstandpunk;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
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
public class AusruestungsgegenstandPunkEditJInternalFrame
	extends AbstractEditJInternalFrame<AusruestungsgegenstandPunk> {

	public AusruestungsgegenstandPunkEditJInternalFrame(
		AusruestungsgegenstandPunk toEdit,
		ItemProvider<Punk> punks,
		ItemProvider<Ausruestungsgegenstand> ausruestungsgegenstands,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<AusruestungsgegenstandPunk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Ausruestungsgegenstand Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(
				AusruestungsgegenstandPunkEditJPanel.PUNK_ITEM_PROVIDER_ID,
				punks,
				AusruestungsgegenstandPunkEditJPanel.AUSRUESTUNGSGEGENSTAND_ITEM_PROVIDER_ID,
				ausruestungsgegenstands
			)
		);
	}

	@Override
	protected JPanel createEditorPanel(AusruestungsgegenstandPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new AusruestungsgegenstandPunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}
}

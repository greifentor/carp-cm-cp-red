package de.ollie.carp.cm.cp.red.gui.swing.edit.punk;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditJInternalFrame;
import java.util.Map;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

public class PunkEditJInternalFrame extends AbstractEditJInternalFrame<Punk> {

	public PunkEditJInternalFrame(
		Punk toEdit,
		ItemProvider<Panzerung> panzerungs,
		EditDialogComponentFactory editDialogComponentFactory,
		Observer<Punk> observer,
		JDesktopPane desktopPane
	) {
		super(
			desktopPane,
			"Punk",
			toEdit,
			editDialogComponentFactory,
			observer,
			Map.of(PunkEditJPanel.PANZERUNG_ITEM_PROVIDER_ID, panzerungs)
		);
	}

	@Override
	protected JPanel createEditorPanel(Punk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		editPanel = new PunkEditJPanel(toEdit, itemProviders);
		return editPanel;
	}

	@Override
	protected boolean isPrintable() {
		return true;
	}
}

package de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstand;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJPanel;
import de.ollie.carp.cm.cp.red.gui.swing.select.SelectionPanelObserver;
import java.util.UUID;
import javax.swing.JDesktopPane;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class AusruestungsgegenstandSelectJInternalFrame
	extends AbstractSelectJInternalFrame<Ausruestungsgegenstand>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Ausruestungsgegenstand";

	private final AusruestungsgegenstandService ausruestungsgegenstandService;

	public AusruestungsgegenstandSelectJInternalFrame(
		AusruestungsgegenstandService ausruestungsgegenstandService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.ausruestungsgegenstandService = ausruestungsgegenstandService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Ausruestungsgegenstand> createSelectPanel() {
		return new AusruestungsgegenstandSelectJPanel(
			ausruestungsgegenstandService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

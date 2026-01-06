package de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstandpunk;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
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
public class AusruestungsgegenstandPunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<AusruestungsgegenstandPunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "AusruestungsgegenstandPunk";

	private final AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService;
	private final AusruestungsgegenstandService ausruestungsgegenstandService;
	private final PunkService punkService;

	public AusruestungsgegenstandPunkSelectJInternalFrame(
		AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService,
		AusruestungsgegenstandService ausruestungsgegenstandService,
		PunkService punkService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.ausruestungsgegenstandPunkService = ausruestungsgegenstandPunkService;
		this.ausruestungsgegenstandService = ausruestungsgegenstandService;
		this.punkService = punkService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<AusruestungsgegenstandPunk> createSelectPanel() {
		return new AusruestungsgegenstandPunkSelectJPanel(
			ausruestungsgegenstandPunkService,
			ausruestungsgegenstandService,
			punkService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

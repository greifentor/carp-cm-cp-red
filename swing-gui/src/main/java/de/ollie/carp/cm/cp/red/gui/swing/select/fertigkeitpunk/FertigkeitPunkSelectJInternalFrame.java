package de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeitpunk;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
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
public class FertigkeitPunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<FertigkeitPunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "FertigkeitPunk";

	private final FertigkeitPunkService fertigkeitPunkService;
	private final PunkService punkService;
	private final FertigkeitService fertigkeitService;

	public FertigkeitPunkSelectJInternalFrame(
		FertigkeitPunkService fertigkeitPunkService,
		PunkService punkService,
		FertigkeitService fertigkeitService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.fertigkeitPunkService = fertigkeitPunkService;
		this.punkService = punkService;
		this.fertigkeitService = fertigkeitService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<FertigkeitPunk> createSelectPanel() {
		return new FertigkeitPunkSelectJPanel(
			fertigkeitPunkService,
			punkService,
			fertigkeitService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

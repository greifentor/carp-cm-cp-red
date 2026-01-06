package de.ollie.carp.cm.cp.red.gui.swing.select.rollepunk;

import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.RollePunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
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
public class RollePunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<RollePunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "RollePunk";

	private final RollePunkService rollePunkService;
	private final PunkService punkService;
	private final RolleService rolleService;

	public RollePunkSelectJInternalFrame(
		RollePunkService rollePunkService,
		PunkService punkService,
		RolleService rolleService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.rollePunkService = rollePunkService;
		this.punkService = punkService;
		this.rolleService = rolleService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<RollePunk> createSelectPanel() {
		return new RollePunkSelectJPanel(
			rollePunkService,
			punkService,
			rolleService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

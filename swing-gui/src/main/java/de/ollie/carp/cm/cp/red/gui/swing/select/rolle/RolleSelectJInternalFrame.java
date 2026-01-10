package de.ollie.carp.cm.cp.red.gui.swing.select.rolle;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
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
public class RolleSelectJInternalFrame extends AbstractSelectJInternalFrame<Rolle> implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Rolle";

	private final RolleService rolleService;
	private final FertigkeitService fertigkeitService;

	public RolleSelectJInternalFrame(
		RolleService rolleService,
		FertigkeitService fertigkeitService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME, editDialogComponentFactory);
		this.rolleService = rolleService;
		this.fertigkeitService = fertigkeitService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Rolle> createSelectPanel() {
		return new RolleSelectJPanel(
			rolleService,
			fertigkeitService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

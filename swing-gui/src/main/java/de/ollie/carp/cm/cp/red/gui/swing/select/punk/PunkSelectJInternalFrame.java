package de.ollie.carp.cm.cp.red.gui.swing.select.punk;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJPanel;
import de.ollie.carp.cm.cp.red.gui.swing.select.SelectionPanelObserver;
import javax.swing.JDesktopPane;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class PunkSelectJInternalFrame extends AbstractSelectJInternalFrame<Punk> implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Punk";

	private final PunkService punkService;
	private final RolleService rolleService;
	private final PanzerungService panzerungService;

	public PunkSelectJInternalFrame(
		PunkService punkService,
		RolleService rolleService,
		PanzerungService panzerungService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.punkService = punkService;
		this.rolleService = rolleService;
		this.panzerungService = panzerungService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Punk> createSelectPanel() {
		return new PunkSelectJPanel(
			punkService,
			rolleService,
			panzerungService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

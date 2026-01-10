package de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaftpunk;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
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
public class EigenschaftPunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<EigenschaftPunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "EigenschaftPunk";

	private final EigenschaftPunkService eigenschaftPunkService;
	private final PunkService punkService;
	private final EigenschaftService eigenschaftService;

	public EigenschaftPunkSelectJInternalFrame(
		EigenschaftPunkService eigenschaftPunkService,
		PunkService punkService,
		EigenschaftService eigenschaftService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME, editDialogComponentFactory);
		this.eigenschaftPunkService = eigenschaftPunkService;
		this.punkService = punkService;
		this.eigenschaftService = eigenschaftService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<EigenschaftPunk> createSelectPanel() {
		return new EigenschaftPunkSelectJPanel(
			eigenschaftPunkService,
			punkService,
			eigenschaftService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

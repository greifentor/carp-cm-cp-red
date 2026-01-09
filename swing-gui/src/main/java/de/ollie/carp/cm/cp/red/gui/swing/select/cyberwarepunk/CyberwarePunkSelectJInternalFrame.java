package de.ollie.carp.cm.cp.red.gui.swing.select.cyberwarepunk;

import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
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
public class CyberwarePunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<CyberwarePunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "CyberwarePunk";

	private final CyberwarePunkService cyberwarePunkService;
	private final PunkService punkService;
	private final CyberwareService cyberwareService;

	public CyberwarePunkSelectJInternalFrame(
		CyberwarePunkService cyberwarePunkService,
		PunkService punkService,
		CyberwareService cyberwareService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.cyberwarePunkService = cyberwarePunkService;
		this.punkService = punkService;
		this.cyberwareService = cyberwareService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<CyberwarePunk> createSelectPanel() {
		return new CyberwarePunkSelectJPanel(
			cyberwarePunkService,
			punkService,
			cyberwareService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

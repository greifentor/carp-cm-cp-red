package de.ollie.carp.cm.cp.red.gui.swing.select.cyberware;

import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
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
public class CyberwareSelectJInternalFrame
	extends AbstractSelectJInternalFrame<Cyberware>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Cyberware";

	private final CyberwareService cyberwareService;

	public CyberwareSelectJInternalFrame(
		CyberwareService cyberwareService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME, editDialogComponentFactory);
		this.cyberwareService = cyberwareService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Cyberware> createSelectPanel() {
		return new CyberwareSelectJPanel(cyberwareService, CLASS_NAME, desktopPane, editDialogComponentFactory, this);
	}
}

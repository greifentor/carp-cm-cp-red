package de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaft;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
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
public class EigenschaftSelectJInternalFrame
	extends AbstractSelectJInternalFrame<Eigenschaft>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Eigenschaft";

	private final EigenschaftService eigenschaftService;

	public EigenschaftSelectJInternalFrame(
		EigenschaftService eigenschaftService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.eigenschaftService = eigenschaftService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Eigenschaft> createSelectPanel() {
		return new EigenschaftSelectJPanel(eigenschaftService, CLASS_NAME, desktopPane, editDialogComponentFactory, this);
	}
}

package de.ollie.carp.cm.cp.red.gui.swing.select.panzerung;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
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
public class PanzerungSelectJInternalFrame
	extends AbstractSelectJInternalFrame<Panzerung>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Panzerung";

	private final PanzerungService panzerungService;

	public PanzerungSelectJInternalFrame(
		PanzerungService panzerungService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME, editDialogComponentFactory);
		this.panzerungService = panzerungService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Panzerung> createSelectPanel() {
		return new PanzerungSelectJPanel(panzerungService, CLASS_NAME, desktopPane, editDialogComponentFactory, this);
	}
}

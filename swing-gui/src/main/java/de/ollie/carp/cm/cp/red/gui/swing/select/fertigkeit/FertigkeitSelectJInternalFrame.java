package de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeit;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
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
public class FertigkeitSelectJInternalFrame
	extends AbstractSelectJInternalFrame<Fertigkeit>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Fertigkeit";

	private final FertigkeitService fertigkeitService;
	private final EigenschaftService eigenschaftService;

	public FertigkeitSelectJInternalFrame(
		FertigkeitService fertigkeitService,
		EigenschaftService eigenschaftService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME, editDialogComponentFactory);
		this.fertigkeitService = fertigkeitService;
		this.eigenschaftService = eigenschaftService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Fertigkeit> createSelectPanel() {
		return new FertigkeitSelectJPanel(
			fertigkeitService,
			eigenschaftService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

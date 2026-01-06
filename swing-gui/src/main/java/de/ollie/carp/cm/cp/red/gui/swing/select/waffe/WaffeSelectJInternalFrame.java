package de.ollie.carp.cm.cp.red.gui.swing.select.waffe;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
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
public class WaffeSelectJInternalFrame extends AbstractSelectJInternalFrame<Waffe> implements SelectionPanelObserver {

	private static final String CLASS_NAME = "Waffe";

	private final WaffeService waffeService;
	private final FertigkeitService fertigkeitService;

	public WaffeSelectJInternalFrame(
		WaffeService waffeService,
		FertigkeitService fertigkeitService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.waffeService = waffeService;
		this.fertigkeitService = fertigkeitService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<Waffe> createSelectPanel() {
		return new WaffeSelectJPanel(
			waffeService,
			fertigkeitService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

package de.ollie.carp.cm.cp.red.gui.swing.select.waffepunk;

import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
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
public class WaffePunkSelectJInternalFrame
	extends AbstractSelectJInternalFrame<WaffePunk>
	implements SelectionPanelObserver {

	private static final String CLASS_NAME = "WaffePunk";

	private final WaffePunkService waffePunkService;
	private final PunkService punkService;
	private final WaffeService waffeService;

	public WaffePunkSelectJInternalFrame(
		WaffePunkService waffePunkService,
		PunkService punkService,
		WaffeService waffeService,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory
	) {
		super(desktopPane, CLASS_NAME + "s", editDialogComponentFactory);
		this.waffePunkService = waffePunkService;
		this.punkService = punkService;
		this.waffeService = waffeService;
		finishConstruct();
	}

	@Override
	protected AbstractSelectJPanel<WaffePunk> createSelectPanel() {
		return new WaffePunkSelectJPanel(
			waffePunkService,
			punkService,
			waffeService,
			CLASS_NAME,
			desktopPane,
			editDialogComponentFactory,
			this
		);
	}
}

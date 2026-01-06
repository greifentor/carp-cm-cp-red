package de.ollie.carp.cm.cp.red.gui.swing.select.waffepunk;

import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.waffepunk.WaffePunkEditJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJPanel;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectionTableModel;
import de.ollie.carp.cm.cp.red.gui.swing.select.SelectionPanelObserver;
import java.util.List;
import java.util.UUID;
import javax.swing.JDesktopPane;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class WaffePunkSelectJPanel extends AbstractSelectJPanel<WaffePunk> implements SelectionPanelObserver {

	private final WaffePunkService waffePunkService;
	private final PunkService punkService;
	private final WaffeService waffeService;

	public WaffePunkSelectJPanel(
		WaffePunkService waffePunkService,
		PunkService punkService,
		WaffeService waffeService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.waffePunkService = waffePunkService;
		this.punkService = punkService;
		this.waffeService = waffeService;
		updateTableSelection();
	}

	@Override
	protected List<WaffePunk> getObjectsToSelect() {
		return waffePunkService != null ? waffePunkService.listWaffePunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<WaffePunk> createSelectionModel() {
		return new AbstractSelectionTableModel<WaffePunk>(getObjectsToSelect(), "Punk", "Waffe") {
			@Override
			protected Object getColumnValueFor(WaffePunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					case 1 -> (t.getWaffe() != null ? t.getWaffe().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(WaffePunk selected) {
		new WaffePunkEditJInternalFrame(
			selected,
			() -> punkService.listPunks(),
			() -> waffeService.listWaffes(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected WaffePunk createNewObject() {
		return new WaffePunk().setId(UUID.randomUUID()).setPunk(null).setWaffe(null);
	}

	@Override
	protected void delete(WaffePunk toDelete) {
		waffePunkService.deleteWaffePunk(toDelete.getId());
	}

	@Override
	protected void save(WaffePunk toSave) {
		waffePunkService.updateWaffePunk(toSave);
	}
}

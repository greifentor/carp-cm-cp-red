package de.ollie.carp.cm.cp.red.gui.swing.select.rollepunk;

import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.RollePunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.rollepunk.RollePunkEditJInternalFrame;
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
public class RollePunkSelectJPanel extends AbstractSelectJPanel<RollePunk> implements SelectionPanelObserver {

	private final RollePunkService rollePunkService;
	private final PunkService punkService;
	private final RolleService rolleService;

	public RollePunkSelectJPanel(
		RollePunkService rollePunkService,
		PunkService punkService,
		RolleService rolleService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.rollePunkService = rollePunkService;
		this.punkService = punkService;
		this.rolleService = rolleService;
		updateTableSelection();
	}

	@Override
	protected List<RollePunk> getObjectsToSelect() {
		return rollePunkService != null ? rollePunkService.listRollePunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<RollePunk> createSelectionModel() {
		return new AbstractSelectionTableModel<RollePunk>(getObjectsToSelect(), "Punk", "Rolle") {
			@Override
			protected Object getColumnValueFor(RollePunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					case 1 -> (t.getRolle() != null ? t.getRolle().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(RollePunk selected) {
		new RollePunkEditJInternalFrame(
			selected,
			() -> punkService.listPunks(),
			() -> rolleService.listRolles(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected RollePunk createNewObject() {
		return new RollePunk().setId(UUID.randomUUID()).setPunk(null).setRolle(null);
	}

	@Override
	protected void delete(RollePunk toDelete) {
		rollePunkService.deleteRollePunk(toDelete.getId());
	}

	@Override
	protected void save(RollePunk toSave) {
		rollePunkService.updateRollePunk(toSave);
	}
}

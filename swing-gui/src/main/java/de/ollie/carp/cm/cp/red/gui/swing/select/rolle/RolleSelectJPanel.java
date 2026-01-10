package de.ollie.carp.cm.cp.red.gui.swing.select.rolle;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.rolle.RolleEditJInternalFrame;
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
public class RolleSelectJPanel extends AbstractSelectJPanel<Rolle> implements SelectionPanelObserver {

	private final RolleService rolleService;
	private final FertigkeitService fertigkeitService;

	public RolleSelectJPanel(
		RolleService rolleService,
		FertigkeitService fertigkeitService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.rolleService = rolleService;
		this.fertigkeitService = fertigkeitService;
		updateTableSelection();
	}

	@Override
	protected List<Rolle> getObjectsToSelect() {
		return rolleService != null ? rolleService.listRolles().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Rolle> createSelectionModel() {
		return new AbstractSelectionTableModel<Rolle>(getObjectsToSelect(), "Name", "Rollenfertigkeit") {
			@Override
			protected Object getColumnValueFor(Rolle t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					case 1 -> (t.getRollenfertigkeit() != null ? t.getRollenfertigkeit().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Rolle selected) {
		new RolleEditJInternalFrame(
			selected,
			() -> fertigkeitService.listFertigkeits(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected Rolle createNewObject() {
		return new Rolle().setId(UUID.randomUUID()).setName("").setRollenfertigkeit(null);
	}

	@Override
	protected void delete(Rolle toDelete) {
		rolleService.deleteRolle(toDelete.getId());
	}

	@Override
	protected void print(Rolle toPrint) {}

	@Override
	protected void save(Rolle toSave) {
		rolleService.updateRolle(toSave);
	}
}

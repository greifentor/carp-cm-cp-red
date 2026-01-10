package de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeitpunk;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeitpunk.FertigkeitPunkEditJInternalFrame;
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
public class FertigkeitPunkSelectJPanel extends AbstractSelectJPanel<FertigkeitPunk> implements SelectionPanelObserver {

	private final FertigkeitPunkService fertigkeitPunkService;
	private final PunkService punkService;
	private final FertigkeitService fertigkeitService;

	public FertigkeitPunkSelectJPanel(
		FertigkeitPunkService fertigkeitPunkService,
		PunkService punkService,
		FertigkeitService fertigkeitService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.fertigkeitPunkService = fertigkeitPunkService;
		this.punkService = punkService;
		this.fertigkeitService = fertigkeitService;
		updateTableSelection();
	}

	@Override
	protected List<FertigkeitPunk> getObjectsToSelect() {
		return fertigkeitPunkService != null ? fertigkeitPunkService.listFertigkeitPunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<FertigkeitPunk> createSelectionModel() {
		return new AbstractSelectionTableModel<FertigkeitPunk>(getObjectsToSelect(), "Punk", "Fertigkeit", "Wert") {
			@Override
			protected Object getColumnValueFor(FertigkeitPunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					case 1 -> (t.getFertigkeit() != null ? t.getFertigkeit().getName() : "-");
					case 2 -> t.getWert();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(FertigkeitPunk selected) {
		new FertigkeitPunkEditJInternalFrame(
			selected,
			() -> punkService.listPunks(),
			() -> fertigkeitService.listFertigkeits(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected FertigkeitPunk createNewObject() {
		return new FertigkeitPunk().setId(UUID.randomUUID()).setFertigkeit(null).setPunk(null).setWert(0);
	}

	@Override
	protected void delete(FertigkeitPunk toDelete) {
		fertigkeitPunkService.deleteFertigkeitPunk(toDelete.getId());
	}

	@Override
	protected void print(FertigkeitPunk toPrint) {}

	@Override
	protected void save(FertigkeitPunk toSave) {
		fertigkeitPunkService.updateFertigkeitPunk(toSave);
	}
}

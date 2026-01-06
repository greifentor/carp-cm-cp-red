package de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstandpunk;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstandpunk.AusruestungsgegenstandPunkEditJInternalFrame;
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
public class AusruestungsgegenstandPunkSelectJPanel
	extends AbstractSelectJPanel<AusruestungsgegenstandPunk>
	implements SelectionPanelObserver {

	private final AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService;
	private final AusruestungsgegenstandService ausruestungsgegenstandService;
	private final PunkService punkService;

	public AusruestungsgegenstandPunkSelectJPanel(
		AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService,
		AusruestungsgegenstandService ausruestungsgegenstandService,
		PunkService punkService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.ausruestungsgegenstandPunkService = ausruestungsgegenstandPunkService;
		this.ausruestungsgegenstandService = ausruestungsgegenstandService;
		this.punkService = punkService;
		updateTableSelection();
	}

	@Override
	protected List<AusruestungsgegenstandPunk> getObjectsToSelect() {
		return ausruestungsgegenstandPunkService != null
			? ausruestungsgegenstandPunkService.listAusruestungsgegenstandPunks().stream().toList()
			: List.of();
	}

	@Override
	protected AbstractSelectionTableModel<AusruestungsgegenstandPunk> createSelectionModel() {
		return new AbstractSelectionTableModel<AusruestungsgegenstandPunk>(
			getObjectsToSelect(),
			"Ausruestungsgegenstand",
			"Punk"
		) {
			@Override
			protected Object getColumnValueFor(AusruestungsgegenstandPunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getAusruestungsgegenstand() != null ? t.getAusruestungsgegenstand().getName() : "-");
					case 1 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(AusruestungsgegenstandPunk selected) {
		new AusruestungsgegenstandPunkEditJInternalFrame(
			selected,
			() -> ausruestungsgegenstandService.listAusruestungsgegenstands(),
			() -> punkService.listPunks(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected AusruestungsgegenstandPunk createNewObject() {
		return new AusruestungsgegenstandPunk().setId(UUID.randomUUID()).setAusruestungsgegenstand(null).setPunk(null);
	}

	@Override
	protected void delete(AusruestungsgegenstandPunk toDelete) {
		ausruestungsgegenstandPunkService.deleteAusruestungsgegenstandPunk(toDelete.getId());
	}

	@Override
	protected void save(AusruestungsgegenstandPunk toSave) {
		ausruestungsgegenstandPunkService.updateAusruestungsgegenstandPunk(toSave);
	}
}

package de.ollie.carp.cm.cp.red.gui.swing.select.punk;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.punk.PunkEditJInternalFrame;
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
public class PunkSelectJPanel extends AbstractSelectJPanel<Punk> implements SelectionPanelObserver {

	private final PunkService punkService;
	private final RolleService rolleService;
	private final PanzerungService panzerungService;

	public PunkSelectJPanel(
		PunkService punkService,
		RolleService rolleService,
		PanzerungService panzerungService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.punkService = punkService;
		this.rolleService = rolleService;
		this.panzerungService = panzerungService;
		updateTableSelection();
	}

	@Override
	protected List<Punk> getObjectsToSelect() {
		return punkService != null ? punkService.listPunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Punk> createSelectionModel() {
		return new AbstractSelectionTableModel<Punk>(
			getObjectsToSelect(),
			"Name",
			"Rolle",
			"Panzerung Kopf",
			"Panzerung Koerper"
		) {
			@Override
			protected Object getColumnValueFor(Punk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					case 1 -> (t.getRolle() != null ? t.getRolle().getName() : "-");
					case 2 -> (t.getPanzerungKopf() != null ? t.getPanzerungKopf().getName() : "-");
					case 3 -> (t.getPanzerungKoerper() != null ? t.getPanzerungKoerper().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Punk selected) {
		new PunkEditJInternalFrame(
			selected,
			() -> rolleService.listRolles(),
			() -> panzerungService.listPanzerungs(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected Punk createNewObject() {
		return new Punk()
			.setId(UUID.randomUUID())
			.setName("")
			.setPanzerungKoerper(null)
			.setPanzerungKopf(null)
			.setRolle(null);
	}

	@Override
	protected void delete(Punk toDelete) {
		punkService.deletePunk(toDelete.getId());
	}

	@Override
	protected void save(Punk toSave) {
		punkService.updatePunk(toSave);
	}
}

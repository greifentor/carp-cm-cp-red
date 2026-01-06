package de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeit;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeit.FertigkeitEditJInternalFrame;
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
public class FertigkeitSelectJPanel extends AbstractSelectJPanel<Fertigkeit> implements SelectionPanelObserver {

	private final FertigkeitService fertigkeitService;
	private final EigenschaftService eigenschaftService;

	public FertigkeitSelectJPanel(
		FertigkeitService fertigkeitService,
		EigenschaftService eigenschaftService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.fertigkeitService = fertigkeitService;
		this.eigenschaftService = eigenschaftService;
		updateTableSelection();
	}

	@Override
	protected List<Fertigkeit> getObjectsToSelect() {
		return fertigkeitService != null ? fertigkeitService.listFertigkeits().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Fertigkeit> createSelectionModel() {
		return new AbstractSelectionTableModel<Fertigkeit>(
			getObjectsToSelect(),
			"Name",
			"Eigenschaft",
			"Rollenfertigkeit"
		) {
			@Override
			protected Object getColumnValueFor(Fertigkeit t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					case 1 -> (t.getEigenschaft() != null ? t.getEigenschaft().getName() : "-");
					case 2 -> t.isRollenfertigkeit();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Fertigkeit selected) {
		new FertigkeitEditJInternalFrame(
			selected,
			() -> eigenschaftService.listEigenschafts(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected Fertigkeit createNewObject() {
		return new Fertigkeit().setId(UUID.randomUUID()).setEigenschaft(null).setName("").setRollenfertigkeit(false);
	}

	@Override
	protected void delete(Fertigkeit toDelete) {
		fertigkeitService.deleteFertigkeit(toDelete.getId());
	}

	@Override
	protected void save(Fertigkeit toSave) {
		fertigkeitService.updateFertigkeit(toSave);
	}
}

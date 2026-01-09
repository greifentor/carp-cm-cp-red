package de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstand;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstand.AusruestungsgegenstandEditJInternalFrame;
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
public class AusruestungsgegenstandSelectJPanel
	extends AbstractSelectJPanel<Ausruestungsgegenstand>
	implements SelectionPanelObserver {

	private final AusruestungsgegenstandService ausruestungsgegenstandService;

	public AusruestungsgegenstandSelectJPanel(
		AusruestungsgegenstandService ausruestungsgegenstandService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.ausruestungsgegenstandService = ausruestungsgegenstandService;
		updateTableSelection();
	}

	@Override
	protected List<Ausruestungsgegenstand> getObjectsToSelect() {
		return ausruestungsgegenstandService != null
			? ausruestungsgegenstandService.listAusruestungsgegenstands().stream().toList()
			: List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Ausruestungsgegenstand> createSelectionModel() {
		return new AbstractSelectionTableModel<Ausruestungsgegenstand>(getObjectsToSelect(), "Beschreibung", "Name") {
			@Override
			protected Object getColumnValueFor(Ausruestungsgegenstand t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getBeschreibung();
					case 1 -> t.getName();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Ausruestungsgegenstand selected) {
		new AusruestungsgegenstandEditJInternalFrame(selected, getEditDialogComponentFactory(), this, getDesktopPane());
	}

	@Override
	protected Ausruestungsgegenstand createNewObject() {
		return new Ausruestungsgegenstand().setId(UUID.randomUUID()).setBeschreibung("").setName("");
	}

	@Override
	protected void delete(Ausruestungsgegenstand toDelete) {
		ausruestungsgegenstandService.deleteAusruestungsgegenstand(toDelete.getId());
	}

	@Override
	protected void save(Ausruestungsgegenstand toSave) {
		ausruestungsgegenstandService.updateAusruestungsgegenstand(toSave);
	}
}

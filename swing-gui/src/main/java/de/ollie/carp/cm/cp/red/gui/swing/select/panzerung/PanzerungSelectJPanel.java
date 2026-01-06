package de.ollie.carp.cm.cp.red.gui.swing.select.panzerung;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.panzerung.PanzerungEditJInternalFrame;
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
public class PanzerungSelectJPanel extends AbstractSelectJPanel<Panzerung> implements SelectionPanelObserver {

	private final PanzerungService panzerungService;

	public PanzerungSelectJPanel(
		PanzerungService panzerungService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.panzerungService = panzerungService;
		updateTableSelection();
	}

	@Override
	protected List<Panzerung> getObjectsToSelect() {
		return panzerungService != null ? panzerungService.listPanzerungs().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Panzerung> createSelectionModel() {
		return new AbstractSelectionTableModel<Panzerung>(getObjectsToSelect(), "Koerperpanzerung", "Name", "Sw") {
			@Override
			protected Object getColumnValueFor(Panzerung t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.isKoerperpanzerung();
					case 1 -> t.getName();
					case 2 -> t.getSw();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Panzerung selected) {
		new PanzerungEditJInternalFrame(selected, getEditDialogComponentFactory(), this, getDesktopPane());
	}

	@Override
	protected Panzerung createNewObject() {
		return new Panzerung().setId(UUID.randomUUID()).setKoerperpanzerung(false).setName("").setSw(0);
	}

	@Override
	protected void delete(Panzerung toDelete) {
		panzerungService.deletePanzerung(toDelete.getId());
	}

	@Override
	protected void save(Panzerung toSave) {
		panzerungService.updatePanzerung(toSave);
	}
}

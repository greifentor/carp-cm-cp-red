package de.ollie.carp.cm.cp.red.gui.swing.select.cyberware;

import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.cyberware.CyberwareEditJInternalFrame;
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
public class CyberwareSelectJPanel extends AbstractSelectJPanel<Cyberware> implements SelectionPanelObserver {

	private final CyberwareService cyberwareService;

	public CyberwareSelectJPanel(
		CyberwareService cyberwareService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.cyberwareService = cyberwareService;
		updateTableSelection();
	}

	@Override
	protected List<Cyberware> getObjectsToSelect() {
		return cyberwareService != null ? cyberwareService.listCyberwares().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Cyberware> createSelectionModel() {
		return new AbstractSelectionTableModel<Cyberware>(getObjectsToSelect(), "Name", "Beschreibung") {
			@Override
			protected Object getColumnValueFor(Cyberware t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					case 1 -> t.getBeschreibung();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Cyberware selected) {
		new CyberwareEditJInternalFrame(selected, getEditDialogComponentFactory(), this, getDesktopPane());
	}

	@Override
	protected Cyberware createNewObject() {
		return new Cyberware().setId(UUID.randomUUID()).setBeschreibung("").setName("");
	}

	@Override
	protected void delete(Cyberware toDelete) {
		cyberwareService.deleteCyberware(toDelete.getId());
	}

	@Override
	protected void print(Cyberware toPrint) {}

	@Override
	protected void save(Cyberware toSave) {
		cyberwareService.updateCyberware(toSave);
	}
}

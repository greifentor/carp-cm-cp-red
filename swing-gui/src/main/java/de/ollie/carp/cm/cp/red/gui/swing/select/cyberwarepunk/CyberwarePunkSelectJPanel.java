package de.ollie.carp.cm.cp.red.gui.swing.select.cyberwarepunk;

import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.cyberwarepunk.CyberwarePunkEditJInternalFrame;
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
public class CyberwarePunkSelectJPanel extends AbstractSelectJPanel<CyberwarePunk> implements SelectionPanelObserver {

	private final CyberwarePunkService cyberwarePunkService;
	private final PunkService punkService;
	private final CyberwareService cyberwareService;

	public CyberwarePunkSelectJPanel(
		CyberwarePunkService cyberwarePunkService,
		PunkService punkService,
		CyberwareService cyberwareService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.cyberwarePunkService = cyberwarePunkService;
		this.punkService = punkService;
		this.cyberwareService = cyberwareService;
		updateTableSelection();
	}

	@Override
	protected List<CyberwarePunk> getObjectsToSelect() {
		return cyberwarePunkService != null ? cyberwarePunkService.listCyberwarePunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<CyberwarePunk> createSelectionModel() {
		return new AbstractSelectionTableModel<CyberwarePunk>(getObjectsToSelect(), "Punk", "Cyberware") {
			@Override
			protected Object getColumnValueFor(CyberwarePunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					case 1 -> (t.getCyberware() != null ? t.getCyberware().getName() : "-");
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(CyberwarePunk selected) {
		new CyberwarePunkEditJInternalFrame(
			selected,
			() -> punkService.listPunks(),
			() -> cyberwareService.listCyberwares(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected CyberwarePunk createNewObject() {
		return new CyberwarePunk().setId(UUID.randomUUID()).setCyberware(null).setPunk(null);
	}

	@Override
	protected void delete(CyberwarePunk toDelete) {
		cyberwarePunkService.deleteCyberwarePunk(toDelete.getId());
	}

	@Override
	protected void save(CyberwarePunk toSave) {
		cyberwarePunkService.updateCyberwarePunk(toSave);
	}
}

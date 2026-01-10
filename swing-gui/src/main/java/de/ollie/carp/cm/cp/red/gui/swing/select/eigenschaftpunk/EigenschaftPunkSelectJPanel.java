package de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaftpunk;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.eigenschaftpunk.EigenschaftPunkEditJInternalFrame;
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
public class EigenschaftPunkSelectJPanel
	extends AbstractSelectJPanel<EigenschaftPunk>
	implements SelectionPanelObserver {

	private final EigenschaftPunkService eigenschaftPunkService;
	private final PunkService punkService;
	private final EigenschaftService eigenschaftService;

	public EigenschaftPunkSelectJPanel(
		EigenschaftPunkService eigenschaftPunkService,
		PunkService punkService,
		EigenschaftService eigenschaftService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.eigenschaftPunkService = eigenschaftPunkService;
		this.punkService = punkService;
		this.eigenschaftService = eigenschaftService;
		updateTableSelection();
	}

	@Override
	protected List<EigenschaftPunk> getObjectsToSelect() {
		return eigenschaftPunkService != null ? eigenschaftPunkService.listEigenschaftPunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<EigenschaftPunk> createSelectionModel() {
		return new AbstractSelectionTableModel<EigenschaftPunk>(getObjectsToSelect(), "Punk", "Eigenschaft", "Wert") {
			@Override
			protected Object getColumnValueFor(EigenschaftPunk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> (t.getPunk() != null ? t.getPunk().getName() : "-");
					case 1 -> (t.getEigenschaft() != null ? t.getEigenschaft().getName() : "-");
					case 2 -> t.getWert();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(EigenschaftPunk selected) {
		new EigenschaftPunkEditJInternalFrame(
			selected,
			() -> punkService.listPunks(),
			() -> eigenschaftService.listEigenschafts(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected EigenschaftPunk createNewObject() {
		return new EigenschaftPunk().setId(UUID.randomUUID()).setEigenschaft(null).setPunk(null).setWert(0);
	}

	@Override
	protected void delete(EigenschaftPunk toDelete) {
		eigenschaftPunkService.deleteEigenschaftPunk(toDelete.getId());
	}

	@Override
	protected void print(EigenschaftPunk toPrint) {}

	@Override
	protected void save(EigenschaftPunk toSave) {
		eigenschaftPunkService.updateEigenschaftPunk(toSave);
	}
}

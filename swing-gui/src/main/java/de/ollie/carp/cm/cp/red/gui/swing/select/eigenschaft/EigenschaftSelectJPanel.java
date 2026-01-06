package de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaft;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.eigenschaft.EigenschaftEditJInternalFrame;
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
public class EigenschaftSelectJPanel extends AbstractSelectJPanel<Eigenschaft> implements SelectionPanelObserver {

	private final EigenschaftService eigenschaftService;

	public EigenschaftSelectJPanel(
		EigenschaftService eigenschaftService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.eigenschaftService = eigenschaftService;
		updateTableSelection();
	}

	@Override
	protected List<Eigenschaft> getObjectsToSelect() {
		return eigenschaftService != null ? eigenschaftService.listEigenschafts().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Eigenschaft> createSelectionModel() {
		return new AbstractSelectionTableModel<Eigenschaft>(getObjectsToSelect(), "Name") {
			@Override
			protected Object getColumnValueFor(Eigenschaft t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Eigenschaft selected) {
		new EigenschaftEditJInternalFrame(selected, getEditDialogComponentFactory(), this, getDesktopPane());
	}

	@Override
	protected Eigenschaft createNewObject() {
		return new Eigenschaft().setId(UUID.randomUUID()).setName("");
	}

	@Override
	protected void delete(Eigenschaft toDelete) {
		eigenschaftService.deleteEigenschaft(toDelete.getId());
	}

	@Override
	protected void save(Eigenschaft toSave) {
		eigenschaftService.updateEigenschaft(toSave);
	}
}

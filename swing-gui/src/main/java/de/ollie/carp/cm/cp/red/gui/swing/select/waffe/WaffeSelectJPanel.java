package de.ollie.carp.cm.cp.red.gui.swing.select.waffe;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.waffe.WaffeEditJInternalFrame;
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
public class WaffeSelectJPanel extends AbstractSelectJPanel<Waffe> implements SelectionPanelObserver {

	private final WaffeService waffeService;
	private final FertigkeitService fertigkeitService;

	public WaffeSelectJPanel(
		WaffeService waffeService,
		FertigkeitService fertigkeitService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.waffeService = waffeService;
		this.fertigkeitService = fertigkeitService;
		updateTableSelection();
	}

	@Override
	protected List<Waffe> getObjectsToSelect() {
		return waffeService != null ? waffeService.listWaffes().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Waffe> createSelectionModel() {
		return new AbstractSelectionTableModel<Waffe>(getObjectsToSelect(), "Name", "Fertigkeit", "Schaden") {
			@Override
			protected Object getColumnValueFor(Waffe t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					case 1 -> (t.getFertigkeit() != null ? t.getFertigkeit().getName() : "-");
					case 2 -> t.getSchaden();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Waffe selected) {
		new WaffeEditJInternalFrame(
			selected,
			() -> fertigkeitService.listFertigkeits(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected Waffe createNewObject() {
		return new Waffe().setId(UUID.randomUUID()).setFertigkeit(null).setName("").setSchaden("");
	}

	@Override
	protected void delete(Waffe toDelete) {
		waffeService.deleteWaffe(toDelete.getId());
	}

	@Override
	protected void print(Waffe toPrint) {}

	@Override
	protected void save(Waffe toSave) {
		waffeService.updateWaffe(toSave);
	}
}

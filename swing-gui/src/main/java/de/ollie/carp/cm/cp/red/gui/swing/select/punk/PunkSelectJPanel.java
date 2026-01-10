package de.ollie.carp.cm.cp.red.gui.swing.select.punk;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.ReportPrintService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.EditDialogComponentFactory;
import de.ollie.carp.cm.cp.red.gui.swing.edit.punk.PunkEditJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.print.pdf.viewer.ExternalPdfViewerStarter;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectJPanel;
import de.ollie.carp.cm.cp.red.gui.swing.select.AbstractSelectionTableModel;
import de.ollie.carp.cm.cp.red.gui.swing.select.SelectionPanelObserver;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import javax.swing.JDesktopPane;

public class PunkSelectJPanel extends AbstractSelectJPanel<Punk> implements SelectionPanelObserver {

	private final ExternalPdfViewerStarter externalPdfViewerStarter;
	private final PunkService punkService;
	private final PanzerungService panzerungService;
	private final ReportPrintService reportPrintService;

	public PunkSelectJPanel(
		PunkService punkService,
		PanzerungService panzerungService,
		String className,
		JDesktopPane desktopPane,
		EditDialogComponentFactory editDialogComponentFactory,
		SelectionPanelObserver observer,
		ExternalPdfViewerStarter externalPdfViewerStarter,
		ReportPrintService reportPrintService
	) {
		super(desktopPane, className + "s", editDialogComponentFactory, observer);
		this.externalPdfViewerStarter = externalPdfViewerStarter;
		this.punkService = punkService;
		this.panzerungService = panzerungService;
		this.reportPrintService = reportPrintService;
		updateTableSelection();
	}

	@Override
	protected List<Punk> getObjectsToSelect() {
		return punkService != null ? punkService.listPunks().stream().toList() : List.of();
	}

	@Override
	protected AbstractSelectionTableModel<Punk> createSelectionModel() {
		return new AbstractSelectionTableModel<Punk>(getObjectsToSelect(), "Name") {
			@Override
			protected Object getColumnValueFor(Punk t, int columnIndex) {
				return switch (columnIndex) {
					case 0 -> t.getName();
					default -> null;
				};
			}
		};
	}

	@Override
	protected void createEditInternalFrame(Punk selected) {
		new PunkEditJInternalFrame(
			selected,
			() -> panzerungService.listPanzerungs(),
			getEditDialogComponentFactory(),
			this,
			getDesktopPane()
		);
	}

	@Override
	protected Punk createNewObject() {
		return new Punk().setId(UUID.randomUUID()).setName("").setPanzerungKoerper(null).setPanzerungKopf(null);
	}

	@Override
	protected void delete(Punk toDelete) {
		punkService.deletePunk(toDelete.getId());
	}

	@Override
	protected void print(Punk toPrint) {
		byte[] pdf = reportPrintService.printPunk(toPrint, "jasper", new HashMap<>());
		try {
			externalPdfViewerStarter.show(pdf);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	protected void save(Punk toSave) {
		punkService.updatePunk(toSave);
	}
}

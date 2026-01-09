package de.ollie.carp.cm.cp.red.gui.swing;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.ReportPrintService;
import de.ollie.carp.cm.cp.red.core.service.RollePunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.print.pdf.viewer.ExternalPdfViewerStarter;
import de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstand.AusruestungsgegenstandSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstandpunk.AusruestungsgegenstandPunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.cyberware.CyberwareSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.cyberwarepunk.CyberwarePunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaft.EigenschaftSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaftpunk.EigenschaftPunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeit.FertigkeitSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeitpunk.FertigkeitPunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.panzerung.PanzerungSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.punk.PunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.rolle.RolleSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.rollepunk.RollePunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.waffe.WaffeSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.waffepunk.WaffePunkSelectJInternalFrame;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class CarpCmCpRedMainFrame extends JFrame implements ActionListener {

	private final AusruestungsgegenstandService ausruestungsgegenstandService;
	private final AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService;
	private final CyberwareService cyberwareService;
	private final CyberwarePunkService cyberwarePunkService;
	private final EditDialogComponentFactory editDialogComponentFactory;
	private final EigenschaftService eigenschaftService;
	private final EigenschaftPunkService eigenschaftPunkService;
	private final ExternalPdfViewerStarter externalPdfViewerStarter;
	private final FertigkeitService fertigkeitService;
	private final FertigkeitPunkService fertigkeitPunkService;
	private final PanzerungService panzerungService;
	private final PunkService punkService;
	private final ReportPrintService reportPrintService;
	private final RolleService rolleService;
	private final RollePunkService rollePunkService;
	private final WaffeService waffeService;
	private final WaffePunkService waffePunkService;

	private JDesktopPane desktopPane;
	private JMenuItem menuItemEditAusruestungsgegenstand;
	private JMenuItem menuItemEditAusruestungsgegenstandPunk;
	private JMenuItem menuItemEditCyberware;
	private JMenuItem menuItemEditCyberwarePunk;
	private JMenuItem menuItemEditEigenschaft;
	private JMenuItem menuItemEditEigenschaftPunk;
	private JMenuItem menuItemEditFertigkeit;
	private JMenuItem menuItemEditFertigkeitPunk;
	private JMenuItem menuItemEditPunk;
	private JMenuItem menuItemEditPanzerung;
	private JMenuItem menuItemEditRolle;
	private JMenuItem menuItemEditRollePunk;
	private JMenuItem menuItemEditWaffe;
	private JMenuItem menuItemEditWaffePunk;
	private JMenuItem menuItemFilePrint;
	private JMenuItem menuItemFileQuit;

	@PostConstruct
	void postConstruct() {
		desktopPane = new JDesktopPane();
		desktopPane.setMinimumSize(new Dimension(200, 100));
		JPanel mainPanel = new JPanel(new BorderLayout(HGAP, VGAP));
		mainPanel.add(desktopPane, BorderLayout.CENTER);
		setJMenuBar(createJMenuBar());
		setContentPane(mainPanel);
		setBounds(100, 100, 800, 800);
	}

	public void showFrame() {
		//		try {
		//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		//			SwingUtilities.updateComponentTreeUI(this);
		//		} catch (Exception e) {
		//			e.printStackTrace();
		//		}
		setTitle("CARP Charaktermanager Cyberpunk Red");
		setVisible(true);
	}

	private JMenuBar createJMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		menuItemFilePrint = createMenuItem("Print", this);
		menu.add(menuItemFilePrint);
		menu.add(new JSeparator());
		menuItemFileQuit = createMenuItem("Quit", this);
		menu.add(menuItemFileQuit);
		menuBar.add(menu);
		menu = new JMenu("Edit");
		menuItemEditAusruestungsgegenstand = createMenuItem("Ausrüstungsgegenstand", this);
		menu.add(menuItemEditAusruestungsgegenstand);
		menuItemEditAusruestungsgegenstandPunk = createMenuItem("Ausrüstungsgegenstand - Punk", this);
		menu.add(menuItemEditAusruestungsgegenstandPunk);
		menuItemEditCyberware = createMenuItem("Cyberware", this);
		menu.add(menuItemEditCyberware);
		menuItemEditCyberwarePunk = createMenuItem("Cyberware - Punk", this);
		menu.add(menuItemEditCyberwarePunk);
		menuItemEditEigenschaft = createMenuItem("Eigenschaft", this);
		menu.add(menuItemEditEigenschaft);
		menuItemEditEigenschaftPunk = createMenuItem("Eigenschaft - Punk", this);
		menu.add(menuItemEditEigenschaftPunk);
		menuItemEditFertigkeit = createMenuItem("Fertigkeit", this);
		menu.add(menuItemEditFertigkeit);
		menuItemEditFertigkeitPunk = createMenuItem("Fertigkeit - Punk", this);
		menu.add(menuItemEditFertigkeitPunk);
		menuItemEditPanzerung = createMenuItem("Panzerung", this);
		menu.add(menuItemEditPanzerung);
		menuItemEditPunk = createMenuItem("Punk", this);
		menu.add(menuItemEditPunk);
		menuItemEditRollePunk = createMenuItem("Rolle - Punk", this);
		menu.add(menuItemEditRollePunk);
		menuItemEditRolle = createMenuItem("Rolle", this);
		menu.add(menuItemEditRolle);
		menuItemEditWaffe = createMenuItem("Waffe", this);
		menu.add(menuItemEditWaffe);
		menuItemEditWaffePunk = createMenuItem("Waffe - Punk", this);
		menu.add(menuItemEditWaffePunk);
		menuBar.add(menu);
		return menuBar;
	}

	private JMenuItem createMenuItem(String text, ActionListener listener) {
		JMenuItem menuItem = new JMenuItem(text);
		menuItem.addActionListener(listener);
		return menuItem;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuItemEditAusruestungsgegenstand) {
			new AusruestungsgegenstandSelectJInternalFrame(
				ausruestungsgegenstandService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditAusruestungsgegenstandPunk) {
			new AusruestungsgegenstandPunkSelectJInternalFrame(
				ausruestungsgegenstandPunkService,
				punkService,
				ausruestungsgegenstandService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditCyberware) {
			new CyberwareSelectJInternalFrame(cyberwareService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditCyberwarePunk) {
			new CyberwarePunkSelectJInternalFrame(
				cyberwarePunkService,
				punkService,
				cyberwareService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditEigenschaft) {
			new EigenschaftSelectJInternalFrame(eigenschaftService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditEigenschaftPunk) {
			new EigenschaftPunkSelectJInternalFrame(
				eigenschaftPunkService,
				punkService,
				eigenschaftService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditFertigkeit) {
			new FertigkeitSelectJInternalFrame(
				fertigkeitService,
				eigenschaftService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditFertigkeitPunk) {
			new FertigkeitPunkSelectJInternalFrame(
				fertigkeitPunkService,
				punkService,
				fertigkeitService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditPunk) {
			new PunkSelectJInternalFrame(punkService, panzerungService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditPanzerung) {
			new PanzerungSelectJInternalFrame(panzerungService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditRolle) {
			new RolleSelectJInternalFrame(rolleService, fertigkeitService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditRollePunk) {
			new RollePunkSelectJInternalFrame(
				rollePunkService,
				punkService,
				rolleService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditWaffe) {
			new WaffeSelectJInternalFrame(waffeService, fertigkeitService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditWaffePunk) {
			new WaffePunkSelectJInternalFrame(
				waffePunkService,
				punkService,
				waffeService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemFilePrint) {
			Punk punk = punkService.listPunks().get(0);
			byte[] pdf = reportPrintService.printPunk(punk, "jasper", new HashMap<>());
			try {
				externalPdfViewerStarter.show(pdf);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		} else if (e.getSource() == menuItemFileQuit) {
			System.exit(0);
		}
	}
}

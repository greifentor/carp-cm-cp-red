package de.ollie.carp.cm.cp.red.gui.swing;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstand.AusruestungsgegenstandSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.ausruestungsgegenstandpunk.AusruestungsgegenstandPunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.eigenschaft.EigenschaftSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.fertigkeit.FertigkeitSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.panzerung.PanzerungSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.punk.PunkSelectJInternalFrame;
import de.ollie.carp.cm.cp.red.gui.swing.select.rolle.RolleSelectJInternalFrame;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
public class CarpCmCpRedMainFrame extends JFrame implements ActionListener {

	private final AusruestungsgegenstandService ausruestungsgegenstandService;
	private final AusruestungsgegenstandPunkService ausruestungsgegenstandPunkService;
	private final EditDialogComponentFactory editDialogComponentFactory;
	private final EigenschaftService eigenschaftService;
	private final FertigkeitService fertigkeitService;
	private final PanzerungService panzerungService;
	private final PunkService punkService;
	private final RolleService rolleService;

	private JDesktopPane desktopPane;
	private JMenuItem menuItemEditAusruestungsgegenstands;
	private JMenuItem menuItemEditAusruestungsgegenstandPunk;
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
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("Health-Tracker");
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
		menuItemEditAusruestungsgegenstands = createMenuItem("Ausrüstungsgegenstand", this);
		menu.add(menuItemEditAusruestungsgegenstands);
		menuItemEditAusruestungsgegenstandPunk = createMenuItem("Ausrüstungsgegenstand - Punk", this);
		menu.add(menuItemEditAusruestungsgegenstandPunk);
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
		if (e.getSource() == menuItemEditAusruestungsgegenstands) {
			new AusruestungsgegenstandSelectJInternalFrame(
				ausruestungsgegenstandService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditAusruestungsgegenstandPunk) {
			new AusruestungsgegenstandPunkSelectJInternalFrame(
				ausruestungsgegenstandPunkService,
				ausruestungsgegenstandService,
				punkService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditEigenschaft) {
			new EigenschaftSelectJInternalFrame(eigenschaftService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditEigenschaftPunk) {} else if (e.getSource() == menuItemEditFertigkeit) {
			new FertigkeitSelectJInternalFrame(
				fertigkeitService,
				eigenschaftService,
				desktopPane,
				editDialogComponentFactory
			);
		} else if (e.getSource() == menuItemEditFertigkeitPunk) {} else if (e.getSource() == menuItemEditPunk) {
			new PunkSelectJInternalFrame(punkService, panzerungService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditPanzerung) {
			new PanzerungSelectJInternalFrame(panzerungService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditRolle) {
			new RolleSelectJInternalFrame(rolleService, fertigkeitService, desktopPane, editDialogComponentFactory);
		} else if (e.getSource() == menuItemEditRollePunk) {} else if (e.getSource() == menuItemEditWaffe) {} else if (
			e.getSource() == menuItemEditWaffePunk
		) {} else if (e.getSource() == menuItemFilePrint) {
			//			LocalDate now = LocalDate.now();
			//			byte[] pdf = reportPrintService.printForTimeInterval(
			//				now.withDayOfMonth(1),
			//				now.withDayOfMonth(now.lengthOfMonth()),
			//				"jasper",
			//				new HashMap<>()
			//			);
			//			try {
			//				externalPdfViewerStarter.show(pdf);
			//			} catch (Exception ex) {
			//				ex.printStackTrace();
			//			}
		} else if (e.getSource() == menuItemFileQuit) {
			System.exit(0);
		}
	}
}

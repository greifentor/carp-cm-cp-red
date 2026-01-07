package de.ollie.carp.cm.cp.red.gui.swing.edit.punk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class PunkEditJPanel extends AbstractEditPanel<Punk> {

	public static final String PANZERUNG_ITEM_PROVIDER_ID = "panzerung-item-provider";

	private JTextField textFieldName;
	private JComboBox<Panzerung> comboBoxPanzerungKopf;
	private JComboBox<Panzerung> comboBoxPanzerungKoerper;

	public PunkEditJPanel(Punk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Name:", "Panzerung Kopf:", "Panzerung Koerper:");
	}

	@Override
	protected JPanel createComponentPanel(Punk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(3, 1, HGAP, VGAP));
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
		List<Panzerung> listPanzerungKopf =
			((ItemProvider<Panzerung>) itemProviders.get(PANZERUNG_ITEM_PROVIDER_ID)).getItem();
		comboBoxPanzerungKopf = new JComboBox<>(listPanzerungKopf.toArray(new Panzerung[listPanzerungKopf.size()]));
		comboBoxPanzerungKopf.setSelectedItem(toEdit.getPanzerungKopf());
		comboBoxPanzerungKopf.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxPanzerungKopf);
		List<Panzerung> listPanzerungKoerper =
			((ItemProvider<Panzerung>) itemProviders.get(PANZERUNG_ITEM_PROVIDER_ID)).getItem();
		comboBoxPanzerungKoerper =
			new JComboBox<>(listPanzerungKoerper.toArray(new Panzerung[listPanzerungKoerper.size()]));
		comboBoxPanzerungKoerper.setSelectedItem(toEdit.getPanzerungKoerper());
		comboBoxPanzerungKoerper.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxPanzerungKoerper);
		return p;
	}

	@Override
	public Punk getCurrentContent() {
		return new Punk()
			.setId(toEdit.getId())
			.setName(textFieldName.getText())
			.setPanzerungKopf(((Panzerung) comboBoxPanzerungKopf.getSelectedItem()))
			.setPanzerungKoerper(((Panzerung) comboBoxPanzerungKoerper.getSelectedItem()));
	}
}

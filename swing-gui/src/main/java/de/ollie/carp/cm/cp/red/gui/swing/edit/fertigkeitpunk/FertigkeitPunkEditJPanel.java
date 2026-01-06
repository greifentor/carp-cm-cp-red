package de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeitpunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class FertigkeitPunkEditJPanel extends AbstractEditPanel<FertigkeitPunk> {

	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";
	public static final String FERTIGKEIT_ITEM_PROVIDER_ID = "fertigkeit-item-provider";

	private JComboBox<Punk> comboBoxPunk;
	private JComboBox<Fertigkeit> comboBoxFertigkeit;
	private JSpinner spinnerWert;

	public FertigkeitPunkEditJPanel(FertigkeitPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Punk:", "Fertigkeit:", "Wert:");
	}

	@Override
	protected JPanel createComponentPanel(FertigkeitPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(3, 1, HGAP, VGAP));
		List<Punk> listPunk = ((ItemProvider<Punk>) itemProviders.get(PUNK_ITEM_PROVIDER_ID)).getItem();
		comboBoxPunk = new JComboBox<>(listPunk.toArray(new Punk[listPunk.size()]));
		comboBoxPunk.setSelectedItem(toEdit.getPunk());
		comboBoxPunk.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxPunk);
		List<Fertigkeit> listFertigkeit =
			((ItemProvider<Fertigkeit>) itemProviders.get(FERTIGKEIT_ITEM_PROVIDER_ID)).getItem();
		comboBoxFertigkeit = new JComboBox<>(listFertigkeit.toArray(new Fertigkeit[listFertigkeit.size()]));
		comboBoxFertigkeit.setSelectedItem(toEdit.getFertigkeit());
		comboBoxFertigkeit.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxFertigkeit);
		SpinnerModel spinnerModelWert = new SpinnerNumberModel(toEdit.getWert(), 0, 1000, 1);
		spinnerWert = new JSpinner(spinnerModelWert);
		p.add(spinnerWert);
		return p;
	}

	@Override
	public FertigkeitPunk getCurrentContent() {
		return new FertigkeitPunk()
			.setId(toEdit.getId())
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()))
			.setFertigkeit(((Fertigkeit) comboBoxFertigkeit.getSelectedItem()))
			.setWert((Integer) spinnerWert.getValue());
	}
}

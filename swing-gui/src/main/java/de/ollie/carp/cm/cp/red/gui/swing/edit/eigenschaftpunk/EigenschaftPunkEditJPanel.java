package de.ollie.carp.cm.cp.red.gui.swing.edit.eigenschaftpunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
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
public class EigenschaftPunkEditJPanel extends AbstractEditPanel<EigenschaftPunk> {

	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";
	public static final String EIGENSCHAFT_ITEM_PROVIDER_ID = "eigenschaft-item-provider";

	private JComboBox<Punk> comboBoxPunk;
	private JComboBox<Eigenschaft> comboBoxEigenschaft;
	private JSpinner spinnerWert;

	public EigenschaftPunkEditJPanel(EigenschaftPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Punk:", "Eigenschaft:", "Wert:");
	}

	@Override
	protected JPanel createComponentPanel(EigenschaftPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
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
		List<Eigenschaft> listEigenschaft =
			((ItemProvider<Eigenschaft>) itemProviders.get(EIGENSCHAFT_ITEM_PROVIDER_ID)).getItem();
		comboBoxEigenschaft = new JComboBox<>(listEigenschaft.toArray(new Eigenschaft[listEigenschaft.size()]));
		comboBoxEigenschaft.setSelectedItem(toEdit.getEigenschaft());
		comboBoxEigenschaft.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxEigenschaft);
		SpinnerModel spinnerModelWert = new SpinnerNumberModel(toEdit.getWert(), 0, 1000, 1);
		spinnerWert = new JSpinner(spinnerModelWert);
		p.add(spinnerWert);
		return p;
	}

	@Override
	public EigenschaftPunk getCurrentContent() {
		return new EigenschaftPunk()
			.setId(toEdit.getId())
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()))
			.setEigenschaft(((Eigenschaft) comboBoxEigenschaft.getSelectedItem()))
			.setWert((Integer) spinnerWert.getValue());
	}
}

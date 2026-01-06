package de.ollie.carp.cm.cp.red.gui.swing.edit.fertigkeit;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.swing.JCheckBox;
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
public class FertigkeitEditJPanel extends AbstractEditPanel<Fertigkeit> {

	public static final String EIGENSCHAFT_ITEM_PROVIDER_ID = "eigenschaft-item-provider";

	private JTextField textFieldName;
	private JComboBox<Eigenschaft> comboBoxEigenschaft;
	private JCheckBox checkBoxRollenfertigkeit;

	public FertigkeitEditJPanel(Fertigkeit toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Name:", "Eigenschaft:", "Rollenfertigkeit:");
	}

	@Override
	protected JPanel createComponentPanel(Fertigkeit toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(3, 1, HGAP, VGAP));
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
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
		checkBoxRollenfertigkeit = new JCheckBox();
		checkBoxRollenfertigkeit.setSelected(toEdit.isRollenfertigkeit());
		p.add(checkBoxRollenfertigkeit);
		return p;
	}

	@Override
	public Fertigkeit getCurrentContent() {
		return new Fertigkeit()
			.setId(toEdit.getId())
			.setName(textFieldName.getText())
			.setEigenschaft(((Eigenschaft) comboBoxEigenschaft.getSelectedItem()))
			.setRollenfertigkeit(checkBoxRollenfertigkeit.isSelected());
	}
}

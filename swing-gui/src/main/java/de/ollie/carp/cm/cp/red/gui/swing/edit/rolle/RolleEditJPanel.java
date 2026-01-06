package de.ollie.carp.cm.cp.red.gui.swing.edit.rolle;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.List;
import java.util.Map;
import java.util.UUID;
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
public class RolleEditJPanel extends AbstractEditPanel<Rolle> {

	public static final String FERTIGKEIT_ITEM_PROVIDER_ID = "fertigkeit-item-provider";

	private JTextField textFieldName;
	private JComboBox<Fertigkeit> comboBoxRollenfertigkeit;

	public RolleEditJPanel(Rolle toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Name:", "Rollenfertigkeit:");
	}

	@Override
	protected JPanel createComponentPanel(Rolle toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(2, 1, HGAP, VGAP));
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
		List<Fertigkeit> listRollenfertigkeit =
			((ItemProvider<Fertigkeit>) itemProviders.get(FERTIGKEIT_ITEM_PROVIDER_ID)).getItem();
		comboBoxRollenfertigkeit =
			new JComboBox<>(listRollenfertigkeit.toArray(new Fertigkeit[listRollenfertigkeit.size()]));
		comboBoxRollenfertigkeit.setSelectedItem(toEdit.getRollenfertigkeit());
		comboBoxRollenfertigkeit.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxRollenfertigkeit);
		return p;
	}

	@Override
	public Rolle getCurrentContent() {
		return new Rolle()
			.setId(toEdit.getId())
			.setName(textFieldName.getText())
			.setRollenfertigkeit(((Fertigkeit) comboBoxRollenfertigkeit.getSelectedItem()));
	}
}

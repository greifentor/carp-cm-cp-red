package de.ollie.carp.cm.cp.red.gui.swing.edit.waffe;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
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
public class WaffeEditJPanel extends AbstractEditPanel<Waffe> {

	public static final String FERTIGKEIT_ITEM_PROVIDER_ID = "fertigkeit-item-provider";

	private JTextField textFieldName;
	private JComboBox<Fertigkeit> comboBoxFertigkeit;
	private JTextField textFieldSchaden;

	public WaffeEditJPanel(Waffe toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Name:", "Fertigkeit:", "Schaden:");
	}

	@Override
	protected JPanel createComponentPanel(Waffe toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(3, 1, HGAP, VGAP));
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
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
		textFieldSchaden = new JTextField(toEdit.getSchaden(), 40);
		p.add(textFieldSchaden);
		return p;
	}

	@Override
	public Waffe getCurrentContent() {
		return new Waffe()
			.setId(toEdit.getId())
			.setName(textFieldName.getText())
			.setFertigkeit(((Fertigkeit) comboBoxFertigkeit.getSelectedItem()))
			.setSchaden(textFieldSchaden.getText());
	}
}

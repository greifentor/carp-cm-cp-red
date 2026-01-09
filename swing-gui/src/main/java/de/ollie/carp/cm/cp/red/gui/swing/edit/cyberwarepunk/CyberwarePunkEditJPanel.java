package de.ollie.carp.cm.cp.red.gui.swing.edit.cyberwarepunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
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
import javax.swing.JTextField;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class CyberwarePunkEditJPanel extends AbstractEditPanel<CyberwarePunk> {

	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";
	public static final String CYBERWARE_ITEM_PROVIDER_ID = "cyberware-item-provider";

	private JComboBox<Punk> comboBoxPunk;
	private JComboBox<Cyberware> comboBoxCyberware;

	public CyberwarePunkEditJPanel(CyberwarePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Punk:", "Cyberware:");
	}

	@Override
	protected JPanel createComponentPanel(CyberwarePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(2, 1, HGAP, VGAP));
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
		List<Cyberware> listCyberware = ((ItemProvider<Cyberware>) itemProviders.get(CYBERWARE_ITEM_PROVIDER_ID)).getItem();
		comboBoxCyberware = new JComboBox<>(listCyberware.toArray(new Cyberware[listCyberware.size()]));
		comboBoxCyberware.setSelectedItem(toEdit.getCyberware());
		comboBoxCyberware.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxCyberware);
		return p;
	}

	@Override
	public CyberwarePunk getCurrentContent() {
		return new CyberwarePunk()
			.setId(toEdit.getId())
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()))
			.setCyberware(((Cyberware) comboBoxCyberware.getSelectedItem()));
	}
}

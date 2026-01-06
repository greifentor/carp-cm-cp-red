package de.ollie.carp.cm.cp.red.gui.swing.edit.rollepunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
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
public class RollePunkEditJPanel extends AbstractEditPanel<RollePunk> {

	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";
	public static final String ROLLE_ITEM_PROVIDER_ID = "rolle-item-provider";

	private JComboBox<Punk> comboBoxPunk;
	private JComboBox<Rolle> comboBoxRolle;

	public RollePunkEditJPanel(RollePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Punk:", "Rolle:");
	}

	@Override
	protected JPanel createComponentPanel(RollePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
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
		List<Rolle> listRolle = ((ItemProvider<Rolle>) itemProviders.get(ROLLE_ITEM_PROVIDER_ID)).getItem();
		comboBoxRolle = new JComboBox<>(listRolle.toArray(new Rolle[listRolle.size()]));
		comboBoxRolle.setSelectedItem(toEdit.getRolle());
		comboBoxRolle.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxRolle);
		return p;
	}

	@Override
	public RollePunk getCurrentContent() {
		return new RollePunk()
			.setId(toEdit.getId())
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()))
			.setRolle(((Rolle) comboBoxRolle.getSelectedItem()));
	}
}

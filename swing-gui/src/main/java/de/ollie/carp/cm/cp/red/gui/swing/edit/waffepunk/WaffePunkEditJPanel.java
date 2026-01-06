package de.ollie.carp.cm.cp.red.gui.swing.edit.waffepunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
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
public class WaffePunkEditJPanel extends AbstractEditPanel<WaffePunk> {

	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";
	public static final String WAFFE_ITEM_PROVIDER_ID = "waffe-item-provider";

	private JComboBox<Punk> comboBoxPunk;
	private JComboBox<Waffe> comboBoxWaffe;

	public WaffePunkEditJPanel(WaffePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Punk:", "Waffe:");
	}

	@Override
	protected JPanel createComponentPanel(WaffePunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
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
		List<Waffe> listWaffe = ((ItemProvider<Waffe>) itemProviders.get(WAFFE_ITEM_PROVIDER_ID)).getItem();
		comboBoxWaffe = new JComboBox<>(listWaffe.toArray(new Waffe[listWaffe.size()]));
		comboBoxWaffe.setSelectedItem(toEdit.getWaffe());
		comboBoxWaffe.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxWaffe);
		return p;
	}

	@Override
	public WaffePunk getCurrentContent() {
		return new WaffePunk()
			.setId(toEdit.getId())
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()))
			.setWaffe(((Waffe) comboBoxWaffe.getSelectedItem()));
	}
}

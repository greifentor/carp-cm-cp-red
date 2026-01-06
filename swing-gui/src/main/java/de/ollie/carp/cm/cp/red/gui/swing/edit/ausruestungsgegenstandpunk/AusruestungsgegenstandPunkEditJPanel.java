package de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstandpunk;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
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
public class AusruestungsgegenstandPunkEditJPanel extends AbstractEditPanel<AusruestungsgegenstandPunk> {

	public static final String AUSRUESTUNGSGEGENSTAND_ITEM_PROVIDER_ID = "ausruestungsgegenstand-item-provider";
	public static final String PUNK_ITEM_PROVIDER_ID = "punk-item-provider";

	private JComboBox<Ausruestungsgegenstand> comboBoxAusruestungsgegenstand;
	private JComboBox<Punk> comboBoxPunk;

	public AusruestungsgegenstandPunkEditJPanel(
		AusruestungsgegenstandPunk toEdit,
		Map<String, ItemProvider<?>> itemProviders
	) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Ausruestungsgegenstand:", "Punk:");
	}

	@Override
	protected JPanel createComponentPanel(AusruestungsgegenstandPunk toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(2, 1, HGAP, VGAP));
		List<Ausruestungsgegenstand> listAusruestungsgegenstand =
			((ItemProvider<Ausruestungsgegenstand>) itemProviders.get(AUSRUESTUNGSGEGENSTAND_ITEM_PROVIDER_ID)).getItem();
		comboBoxAusruestungsgegenstand =
			new JComboBox<>(
				listAusruestungsgegenstand.toArray(new Ausruestungsgegenstand[listAusruestungsgegenstand.size()])
			);
		comboBoxAusruestungsgegenstand.setSelectedItem(toEdit.getAusruestungsgegenstand());
		comboBoxAusruestungsgegenstand.setRenderer((list, value, index, isSelected, cellHasFocus) -> {
			if (value != null) {
				return new JLabel(value.getName());
			}
			return new JLabel("-");
		});
		p.add(comboBoxAusruestungsgegenstand);
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
		return p;
	}

	@Override
	public AusruestungsgegenstandPunk getCurrentContent() {
		return new AusruestungsgegenstandPunk()
			.setId(toEdit.getId())
			.setAusruestungsgegenstand(((Ausruestungsgegenstand) comboBoxAusruestungsgegenstand.getSelectedItem()))
			.setPunk(((Punk) comboBoxPunk.getSelectedItem()));
	}
}

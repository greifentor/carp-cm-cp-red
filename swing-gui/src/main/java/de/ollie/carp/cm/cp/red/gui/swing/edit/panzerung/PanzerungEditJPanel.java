package de.ollie.carp.cm.cp.red.gui.swing.edit.panzerung;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.Map;
import java.util.UUID;
import javax.swing.JCheckBox;
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
public class PanzerungEditJPanel extends AbstractEditPanel<Panzerung> {

	private JCheckBox checkBoxKoerperpanzerung;
	private JTextField textFieldName;
	private JSpinner spinnerSw;

	public PanzerungEditJPanel(Panzerung toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Koerperpanzerung:", "Name:", "Sw:");
	}

	@Override
	protected JPanel createComponentPanel(Panzerung toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(3, 1, HGAP, VGAP));
		checkBoxKoerperpanzerung = new JCheckBox();
		checkBoxKoerperpanzerung.setSelected(toEdit.isKoerperpanzerung());
		p.add(checkBoxKoerperpanzerung);
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
		SpinnerModel spinnerModelSw = new SpinnerNumberModel(toEdit.getSw(), 0, 1000, 1);
		spinnerSw = new JSpinner(spinnerModelSw);
		p.add(spinnerSw);
		return p;
	}

	@Override
	public Panzerung getCurrentContent() {
		return new Panzerung()
			.setId(toEdit.getId())
			.setKoerperpanzerung(checkBoxKoerperpanzerung.isSelected())
			.setName(textFieldName.getText())
			.setSw((Integer) spinnerSw.getValue());
	}
}

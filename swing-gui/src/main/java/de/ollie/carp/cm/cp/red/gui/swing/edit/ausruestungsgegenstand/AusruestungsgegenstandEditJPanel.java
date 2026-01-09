package de.ollie.carp.cm.cp.red.gui.swing.edit.ausruestungsgegenstand;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.gui.swing.ItemProvider;
import de.ollie.carp.cm.cp.red.gui.swing.edit.AbstractEditPanel;
import java.awt.GridLayout;
import java.util.Map;
import java.util.UUID;
import javax.swing.JPanel;
import javax.swing.JTextField;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public class AusruestungsgegenstandEditJPanel extends AbstractEditPanel<Ausruestungsgegenstand> {

	private JTextField textFieldBeschreibung;
	private JTextField textFieldName;

	public AusruestungsgegenstandEditJPanel(Ausruestungsgegenstand toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Beschreibung:", "Name:");
	}

	@Override
	protected JPanel createComponentPanel(Ausruestungsgegenstand toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(2, 1, HGAP, VGAP));
		textFieldBeschreibung = new JTextField(toEdit.getBeschreibung(), 40);
		p.add(textFieldBeschreibung);
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
		return p;
	}

	@Override
	public Ausruestungsgegenstand getCurrentContent() {
		return new Ausruestungsgegenstand()
			.setId(toEdit.getId())
			.setBeschreibung(textFieldBeschreibung.getText())
			.setName(textFieldName.getText());
	}
}

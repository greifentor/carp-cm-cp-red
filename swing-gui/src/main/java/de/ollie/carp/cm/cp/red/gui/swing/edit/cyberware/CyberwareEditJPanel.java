package de.ollie.carp.cm.cp.red.gui.swing.edit.cyberware;

import static de.ollie.carp.cm.cp.red.gui.swing.Constants.HGAP;
import static de.ollie.carp.cm.cp.red.gui.swing.Constants.VGAP;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
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
public class CyberwareEditJPanel extends AbstractEditPanel<Cyberware> {

	private JTextField textFieldName;
	private JTextField textFieldBeschreibung;

	public CyberwareEditJPanel(Cyberware toEdit, Map<String, ItemProvider<?>> itemProviders) {
		super(toEdit, itemProviders);
	}

	@Override
	protected JPanel createLabelPanel() {
		return createLabelSubPanel("Name:", "Beschreibung:");
	}

	@Override
	protected JPanel createComponentPanel(Cyberware toEdit, Map<String, ItemProvider<?>> itemProviders) {
		JPanel p = new JPanel(new GridLayout(2, 1, HGAP, VGAP));
		textFieldName = new JTextField(toEdit.getName(), 40);
		p.add(textFieldName);
		textFieldBeschreibung = new JTextField(toEdit.getBeschreibung(), 40);
		p.add(textFieldBeschreibung);
		return p;
	}

	@Override
	public Cyberware getCurrentContent() {
		return new Cyberware()
			.setId(toEdit.getId())
			.setName(textFieldName.getText())
			.setBeschreibung(textFieldBeschreibung.getText());
	}
}

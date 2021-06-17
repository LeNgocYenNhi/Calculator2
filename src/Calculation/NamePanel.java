package Calculation;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

public class NamePanel {
	JLabel fontNameLabel = new JLabel("Font Name:");
	private Name fontName = new Name();
	Box nameBox = Box.createVerticalBox();
	public NamePanel() {
	JLabel fontNameLabel = new JLabel("Font Name:");
	Box nameBox = Box.createVerticalBox();
	nameBox.add(fontNameLabel);
	}
	public JLabel getFontNameLabel() {
		return fontNameLabel;
	}
	public void setFontNameLabel(JLabel fontNameLabel) {
		this.fontNameLabel = fontNameLabel;
	}
	public void action(ListSelectionListener listener) {
		if (listener != null) {
	        fontName.addListSelectionListener(listener);
	    }
	    JScrollPane namePane = new JScrollPane(fontName);
	    nameBox.add(namePane);
	    nameBox.add(Box.createVerticalStrut(10));
	}
	

}

package Calculation;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class ModeButton extends Button {
	JRadioButton rad = new JRadioButton(), deg = new JRadioButton();
	JRadioButton [] Buttons = {rad, deg};
	ButtonGroup modeGroup = new ButtonGroup();
	public ModeButton() {
		creatModeButton();
	}
	public void creatModeButton() {
		rad.setText("Rad");
		deg.setText("Deg");
		for(JRadioButton _Mode : Buttons) {
			modeGroup.add(_Mode);
			_Mode.setFont(new Font("NewellsHand", Font.PLAIN, 20));
		}
	}

	public void setOperatorButton() {
		for(JRadioButton _Mode : Buttons) {
			_Mode.setBackground(getBG_COLOR());
			_Mode.setFont(getFont());
		}
	}

}

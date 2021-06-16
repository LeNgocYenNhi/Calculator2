package Calculation;
import javax.swing.*;


public class NumberButton extends Button {
	
	JButton One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Zero;
	JButton Buttons[] = {Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine};

	NumberButton(){
		creatNumberButton();
	}
	
	public void creatNumberButton() {
		for(int i = 0; i < 10; i++) {
			Buttons[i] = new JButton(Integer.toString(i));
			Buttons[i].setBackground(getBG_COLOR());
			Buttons[i].setFont(numberFont);
		}
	}
	
	
}

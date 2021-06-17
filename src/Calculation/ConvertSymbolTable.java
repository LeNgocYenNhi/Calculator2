package Calculation;

import java.awt.GridLayout;

public class ConvertSymbolTable extends SymbolTable{
	public ConvertSymbolTable(){
		creatSymbolTable();
	}
	@Override
	public void creatSymbolTable() {
		Panel.setBounds(5,300,572,400);
		Panel.setLayout(new GridLayout(4,3,1,1));
		

		Panel.add(numButton.Buttons[9]);
		Panel.add(numButton.Buttons[8]);
		Panel.add(numButton.Buttons[7]);
	
		
		Panel.add(numButton.Buttons[6]);
		Panel.add(numButton.Buttons[5]);
		Panel.add(numButton.Buttons[4]);
		
		Panel.add(numButton.Buttons[3]);
		Panel.add(numButton.Buttons[2]);
		Panel.add(numButton.Buttons[1]);
		

		Panel.add(operButton.dot);
		Panel.add(numButton.Buttons[0]);
		Panel.add(operButton.del);
		
	}

}

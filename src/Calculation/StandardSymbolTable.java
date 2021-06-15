package Calculation;

import java.awt.*;


public class StandardSymbolTable extends SymbolTable {
		public StandardSymbolTable(){
			creatSymbolTable();
		}
		@Override
		public void creatSymbolTable() {
			Panel.setBounds(10,400,1440,600);
			Panel.setLayout(new GridLayout(5,5,1,1));

			Panel.add(operButton.sqrt);
			Panel.add(operButton.del);
			Panel.add(operButton.clr);
			Panel.add(operButton.div);

			Panel.add(numButton.Buttons[7]);
			Panel.add(numButton.Buttons[8]);
			Panel.add(numButton.Buttons[9]);
			Panel.add(operButton.mul);

			Panel.add(numButton.Buttons[4]);
			Panel.add(numButton.Buttons[5]);
			Panel.add(numButton.Buttons[6]);
			Panel.add(operButton.sub);

			Panel.add(numButton.Buttons[1]);
			Panel.add(numButton.Buttons[2]);
			Panel.add(numButton.Buttons[3]);
			Panel.add(operButton.add);

			Panel.add(operButton.neg);
			Panel.add(numButton.Buttons[0]);
			Panel.add(operButton.dot);
			Panel.add(operButton.equ);
		}
		
}

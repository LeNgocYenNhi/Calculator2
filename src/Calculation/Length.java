package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Length extends Convertor implements ActionListener{
	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected InputField Input;
	protected OutputField Output;
	JComboBox toBox, fromBox;
	String sign;
	double temp, result;
	public Length() {
		
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Length");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 600);
		frame.setLayout(null);
		
		Input.getPanel().setBounds(10, 115, 275, 55);
		Input.getPanel().setFont(new Font("NewellsHand", Font.PLAIN, 30));
		Input.setText("");
		frame.add(Input.Panel);
		
		
		Output.getPanel().setBounds(10, 2755, 275, 55);
		Output.getPanel().setFont(new Font("NewellsHand",Font.PLAIN, 30));
		Output.setText("");
		frame.add(Output.Panel);

		String []  item = {"Met", "Centimet", "Kilomet","Milimet","Inch","Feet"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
		fromBox.addActionListener(this);
        	fromBox.setBounds(285, 115, 100, 55);
        	frame.add(fromBox);
		
        
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        	toBox.setBounds(285,275,100,55);
		frame.add(toBox);
        
        
        
       		SymTable.setBounds(435,10,390,540);
		SymTable.setLayout(new GridLayout(4,3,1,1));
		
		for (JButton button : SymTable.numButton.Buttons){
            		button.addActionListener(this);
        	}
		
		SymTable.operButton.dot.addActionListener(this);
		SymTable.operButton.del.addActionListener(this);
		
		frame.add(SymTable.getPanel());
		frame.setVisible(true);	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			if(e.getSource() == SymTable.numButton.Buttons[i]) {
				Input.setText(Input.getText().concat(String.valueOf(i)));
				temp = Double.parseDouble(Input.getText());
			}
		}
		if(e.getSource() == SymTable.operButton.dot) {
			Input.setText(Input.getText().concat("."));
			
		}
		if(e.getSource() == SymTable.operButton.del) {
			String value = "";
			Output.setText(String.valueOf(value));
			Input.setText(String.valueOf(value));
		}
			String valueFromBox = (String) fromBox.getSelectedItem();
			String valueToBox = (String) toBox.getSelectedItem();
			double medium = 0;
			switch (valueFromBox){
			case "Met":
				medium = temp;
				break;
			case "Centimet":
				medium = temp * 0.01;
				break;
			case "Mililet":
				medium = temp * 0.001;
				break;
			case "Kilomet":
				medium = temp * 1000;
				break;
			case "Inch":
				medium = temp * 0.0254;
				break;
			case "Feet":
				medium = temp * 0.3048;
	
			}
			switch (valueToBox){
			case "Met":
				result = medium;
				break;
			
			case "Centimet":
				result = medium * 100;
				break;
			case "Milimet":
				result = medium * 1000;
				break;
			case "Kilomet":
				result = medium * 0.001;
				break;
			case "Inch":
				result = medium * 39.3700787402;
				break;
			case "Feet":
				result = medium * 3.280839895;
			}
			Output.setText(String.valueOf(result));
			
		}

	public static void main (String [] args) {
			new Length();
	}

}


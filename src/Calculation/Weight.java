 package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Weight extends Convertor implements ActionListener{

	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected InputField Input;
	protected OutputField Output;
	JComboBox toBox, fromBox;
	String sign;
	double temp, result;
	public Weight() {
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		Panel = getPanel();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Weight");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 600);
		frame.setLayout(null);
		
	   	Input.getPanel().setBounds(10, 115, 275, 55);
		Input.getPanel().setFont(new Font("NewellsHand", Font.PLAIN, 30));
		Input.setText("");
		frame.add(Input.Panel);
		
		Output.getPanel().setBounds(10, 275, 275, 55);
		Output.getPanel().setFont(new Font("NewellsHand",Font.PLAIN, 30));
		Output.setText("");
		frame.add(Output.Panel);
	
		String []  item = {"Kilograms","Grams", "Decigrams","Centigrams","Miligrams","Tonnes", "Pounds"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(1);
		fromBox.addActionListener(this);
        	fromBox.setBounds(10,50,150,50);
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
			case "Kilograms":
				medium = temp;
				break;
			case "Grams":
				medium = temp / 1000;
				break;
			case "Decigrams":
				medium = temp * 0.0001;
				break;
			case "Centigrams":
				medium = temp * 0.00001;
				break;
			case "Miligrams":
				medium = temp * 0.000001;
				break;
			case "Tonnes":
				medium = temp * 1000;
				break;
			case "Pounds":
				medium = temp * 0.453592;
			}
			switch (valueToBox){
			case "Kilograms":
				result = medium;
				break;
			case "Grams":
				result = medium * 1000;
				break;
			case "Decigrams":
				result =  medium * 10000;
				break;
			case "Centigrams":
				result =  medium* 100000;
				break;
			case "Miligrams":
				result =  medium * 1000000;
				break;
			case "Tonnes":
				result =  medium * 0.001;
				break;
			case "Pounds":
				result = medium * 2.204623;
			}
			Output.setText(String.valueOf(result));
			}
		
		
	
	public static void main (String [] args) {
		new Weight();
	}

}


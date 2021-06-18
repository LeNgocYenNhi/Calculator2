package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Area extends Convertor implements ActionListener{

	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected InputField Input;
	protected OutputField Output;
	JComboBox toBox, fromBox;
	String sign;
	double temp, result;
	public Area() {
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		//ResultArea = getShowResultField();
		Panel = getPanel();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Area");
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
	
		String []  item = {"Square Meters", "Square Centimeters", "Hectares","Square Feet","Square Inches","Are"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
		fromBox.addActionListener(this);
        fromBox.setBounds(285,115,130,55);
        frame.add(fromBox);
		
       
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        toBox.setBounds(285,275,130,55);

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
			case "Square Meters":
				medium = temp;
				break;
			case "Are":
				medium = temp * 100;
				break;
			case "Hectares":
				medium = temp * 10000;
				break;
			case "Square Centimeters":
				medium = temp * 0.0001;
				break;
			case "Square Inches":
				medium = temp * 0.00064516;
				break;
			case "Square Feet":
				medium = temp * 0.09290304;
	
			}
			switch (valueToBox){
			case "Square Meters":
				result = medium;
				break;
			
			case "Are":
				result = medium * 0.01;
				break;
			case "Hectares":
				result = medium * 0.0001;
				break;
			case "Square Centimeters":
				result = medium * 10000;
				break;
			case "Square Inches":
				result = medium * 1550.003;
				break;
			case " Square Feet":
				result = medium * 10.7639104167;
			}
			Output.setText(String.valueOf(result));
			}
		
		
	
	public static void main (String [] args) {
		new Area();
	}

}

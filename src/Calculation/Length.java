package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Length extends Convertor implements ActionListener{
	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected Panel Panel;
	protected InputField Input;
	protected OutputField Output;
	JComboBox toBox, fromBox;
	
	String sign;
	double temp, result;
	public Length() {
		
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		Panel = getPanel();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Length");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 750);
		frame.setLayout(null);
		
		Input.getPanel().setBounds(150,50,180,40);
		Input.getPanel().setFont(new Font("NewellsHand", Font.PLAIN, 30));
		Input.setText("");
		frame.add(Input.Panel);
		
		
		Output.getPanel().setBounds(150,120,180,40);
		Output.getPanel().setFont(new Font("NewellsHand",Font.PLAIN, 30));
		Output.setText("");
		frame.add(Output.Panel);

		String []  item = {"Kilometres", "Centimetres", "Metres", "Inches", "Miles"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
		fromBox.addActionListener(this);
        fromBox.setBounds(400, 50, 150, 40);
        frame.add(fromBox);
		
        
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        toBox.setBounds(400, 120, 150, 40);
        frame.add(toBox);
        
        
        
        SymTable.setBounds(5,300,572,400);
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
			case "Kilometres":
				medium = temp * 1000;
				break;
			
			case "Metres":
				medium = temp;
				break;
			case "Centimetres":
				medium = temp / 100;
				break;
			case "Inches":
				medium = temp * 0.0254;
				break;
			case "Miles":
				medium = 1609.34 * temp;
			}
			
			switch (valueToBox){
			case "Kilometres":
				result = medium /1000;
				break;
			
			case "Metres":
				result = medium;
				break;
			case "Centimetres":
				result = medium * 100;
				break;
			case "Inches":
				result = medium * 100/2.54;
				break;
			case "Miles":
				result = medium * 0.00062137;
			}
			Output.setText(String.valueOf(result));
			
		}

	public static void main (String [] args) {
			new Length();
	}

}


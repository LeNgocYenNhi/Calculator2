 package Calculation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Weight extends Convertor implements ActionListener{

	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected InputField Input;
	protected OutputField Output;
	protected ShowResultField ResultArea;
	JComboBox toBox, fromBox;
	String sign;
	double temp, result;
	public Weight() {
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		ResultArea = getShowResultField();
		Panel = getPanel();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Weight");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 600);
		frame.setLayout(null);
		
	    Input.getPanel().setBounds(10, 110, 400, 50);
		Input.getPanel().setFont(new Font("NewellsHand", Font.PLAIN, 30));
		Input.setText("");
		frame.add(Input.Panel);
		
		Output.getPanel().setBounds(10, 260, 400, 50);
		Output.getPanel().setFont(new Font("NewellsHand",Font.PLAIN, 30));
		Output.setText("");
		frame.add(Output.Panel);
	
		String []  item = {"Kilograms", "Grams", "Pounds"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
		fromBox.addActionListener(this);
        fromBox.setBounds(10,50,150,50);
        frame.add(fromBox);
		
       
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        toBox.setBounds(10,200,150,50);

        frame.add(toBox);
        
		
        SymTable.setBounds(435,10,390,540);
		SymTable.setLayout(new GridLayout(4,3,1,1));
		
		ResultArea.getPanel().setBounds(10,315,417,233);
		ResultArea.getPanel().setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(ResultArea.Panel);
		
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
			case "Pounds":
				result = medium * 2.204623;
			}
			Output.setText(String.valueOf(result));
			}
		
		
	
	public static void main (String [] args) {
		new Weight();
	}

}


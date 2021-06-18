import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Volume extends Convertor implements ActionListener{

	
	protected ConvertSymbolTable SymTable;
	protected ConvertingPanel CalPanel;
	protected InputField Input;
	protected OutputField Output;
	JComboBox toBox, fromBox;
	String sign;
	double temp, result;
	public Volume() {
		CalPanel = getConvertingPanel();
		SymTable = getConvertSymbolTable();
		//ResultArea = getShowResultField();
		Panel = getPanel();
		Input = getInputField();
		Output = getOutputField();
		
		frame = new JFrame("Volume");
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
	
		String []  item = {"Liters", "Mililiters", "Cubic Centimet","Cubic Meters","Cubic Inch","Cubic Feet"};
		fromBox = new JComboBox(item);
		fromBox.setSelectedIndex(2);
		fromBox.addActionListener(this);
        fromBox.setBounds(285,115,100,55);
        frame.add(fromBox);
		
       
		toBox = new JComboBox(item);
		toBox.addActionListener(this);
        toBox.setBounds(285,115,100,55);

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
			case "Liters":
				medium = temp;
				break;
			case "Cubic Centimet":
				medium = temp * 0.001;
				break;
			case "Mililiters":
				medium = temp * 0.001;
				break;
			case " Cubic Meters":
				medium = temp * 1000;
				break;
			case "Cubic Inch":
				medium = temp * 0.016387064;
				break;
			case "Cubic Feet":
				medium = temp * 28.316846592;
	
			}
			switch (valueToBox){
			case "Liters":
				result = medium;
				break;
			
			case "Cubic Centimet":
				result = medium * 1000;
				break;
			case "Mililiters":
				result = medium * 1000;
				break;
			case "Cubic Meters":
				result = medium * 0.001;
				break;
			case "Cubic Inch":
				result = medium * 61.0237440947;
				break;
			case "Cubic Feet":
				result = medium * 0.35314667;
			}
			Output.setText(String.valueOf(result));
			}
		
		
	
	public static void main (String [] args) {
		new Volume();
	}

}

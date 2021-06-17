package Calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScienceCalculator extends Calculator implements ActionListener{

	protected CalculatingPanel CalPanel;
	protected ShowResultField ResultArea;
	protected HistoryField HistoryArea;
	protected SymbolTable SymTable;
	protected Processor Processor;
	protected Menu menu;
	protected Font font = FontChooser.showDialog((Component)null, "Font");

	public ScienceCalculator() {
		CalPanel = getCalculatingPanel();
		ResultArea = getShowResultField();
		HistoryArea = getHistoryField();
		SymTable = getSymbolTable();
		Processor = getProcessor();
		Menu = getMenu();
		

		frame = new JFrame("Science Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1080,760);
		frame.setLayout(null);
		
		Menu.setBounds(0,0,1080, 45);
		Menu.setFont(new Font("NewellsHand", Font.PLAIN, 30));
		frame.add(Menu.getMenuBar());
		
		frame.add(CalPanel.getPanel());
		
		frame.add(ResultArea.Panel);
		
		HistoryArea.setFont(font);
		frame.add(HistoryArea.getPanel());

		for (JButton button : SymTable.numButton.Buttons){
            		button.addActionListener(this);
       		}
        
        	for (JButton button : SymTable.operButton.Buttons){
           		 button.addActionListener(this);
        	}
		frame.add(SymTable.Panel);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Processor.Implement(e);
	}
	
	public static void main(String [] args) {
		new ScienceCalculator ();
	}

}

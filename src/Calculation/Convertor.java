package Calculation;

import javax.swing.JFrame;

public class Convertor {
	JFrame frame;
	ConvertingPanel CalPanel = new ConvertingPanel();
	SymbolTable SymTable = new SymbolTable();
	Panel Panel = new Panel();
	ConvertSymbolTable ConverSymTable = new ConvertSymbolTable();
	InputField Input = new InputField();
	OutputField Output = new OutputField();
	ShowResultField ResultArea = new ShowResultField();
	public Convertor() {
		
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JFrame getFrame() {
		return frame;
	}
	public SymbolTable getSymbolTable() {
        return SymTable;
    }
	public ConvertSymbolTable getConvertSymbolTable() {
        return ConverSymTable;
    }
	public ConvertingPanel getConvertingPanel() {
        return CalPanel;
    }
	public Panel getPanel() {
		return Panel;
	}
	public InputField getInputField() {
		return Input;
	}
	public OutputField getOutputField() {
		return Output;
	}
	public ShowResultField getShowResultField() {
        return ResultArea;
    }
}

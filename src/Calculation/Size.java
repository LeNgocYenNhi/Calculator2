package Calculation;

import javax.swing.JList;

public class Size extends JList {
	private static String [] _Size ={ "12", "14", "18", "24", "30", "36", "48", "60", "72", "96"}; 
							
	public static String[] get_Size() {
		return _Size;
	}

	public static void set_Size(String[] _Size) {
		Size._Size = _Size;
	}

	public Size() {
		super(_Size);
		setSelectedIndex(4); 
		setVisibleRowCount(5);
	}

	public int getFontSize() {
		int size = Integer.parseInt((String)getSelectedValue());
		return size;
	}

}

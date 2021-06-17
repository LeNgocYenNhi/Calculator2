package Calculation;

import java.awt.Font;

import javax.swing.JList;

public class Style extends JList {
	 private static final String[] _Style = {"Plain", "Italic", "Bold", "Bold Italic"};
	public Style() {
	    super(_Style);
	    setSelectedIndex(0);
	    setVisibleRowCount(5);
	}
	public int getFontStyle() {
	    int style = 0;
	    String name = (String) getSelectedValue();
	    if (name.equals("Plain")) {
	      style = Font.PLAIN;
	    }
	    if (name.equals("Italic")) {
	      style = Font.ITALIC;
	    }
	    if (name.equals("Bold")) {
	      style = Font.BOLD;
	    }
	    if(name.equals("Bold Italic")) {
	    	style =  Font.BOLD + Font.ITALIC;
	    }
	    
	    return style;
	  }



}

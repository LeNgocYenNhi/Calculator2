package Calculation;

import java.awt.GraphicsEnvironment;

import javax.swing.JList;

public class Name extends JList {
	private static final String[] _Name=
		      GraphicsEnvironment.getLocalGraphicsEnvironment().
		      getAvailableFontFamilyNames();
	public Name() {
	    super(_Name);
	    setSelectedIndex(3);
	    //setVisibleRowCount();
	  }

	  public String getFontName(){
	    String name = (String) getSelectedValue();
	    return name;
	  }
	
}

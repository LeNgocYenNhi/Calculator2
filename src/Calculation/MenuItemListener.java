package Calculation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuItemListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	  if(e.getActionCommand() == "Standard") {
    		    new StandardCalculator();
    	  }
    	  if(e.getActionCommand() == "Scientific") {
    		    new ScienceCalculator();
    	  }
        if(e.getActionCommand()== "Length") {
          	new Length();
        }
        if(e.getActionCommand() == "Weight") {
          	new Weight();
        }
        if(e.getActionCommand() == "Font") {
        	FontChooser.showDialog((Component)null, "Font");
        }

    }
}

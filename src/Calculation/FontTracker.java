package Calculation;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontTracker implements ActionListener {
	 private FontChooser _fontChooser;
	 private Font font;
	 public FontTracker(FontChooser chooser) {
		 _fontChooser = chooser;
	 }
	 public FontChooser getFontChooser() {
		 return _fontChooser;
	 }

	 public Font getFont() {
		 return font;
	 }
	 public void setFont(Font font) {
		 this.font = font;
	 }
	 
	 public void actionPerformed(ActionEvent e) {
		 setFont(_fontChooser.getSelectedFont());
	  }

	  public Font getSelectedFont() {
	    return getFont();
	  }
	
}

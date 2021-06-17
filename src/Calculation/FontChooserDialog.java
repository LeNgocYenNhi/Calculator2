package Calculation;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FontChooserDialog extends JDialog {
	
	  private FontChooser m_chooserPane;
	  public FontChooserDialog(
	                Component component, 
	                String title, 
	                boolean modal,
	                FontChooser chooserPane,
	                ActionListener okListener,
	                ActionListener cancelListener)
	  {
	    
	    super(JOptionPane.getFrameForComponent(component), 
	          title, modal);

	    m_chooserPane = chooserPane;

	    Container contentPane = getContentPane();
	    contentPane.setLayout(new BorderLayout());
	    contentPane.add(m_chooserPane, BorderLayout.CENTER);

	    JPanel buttonPane = new JPanel();
	    buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));

	    JButton okButton = new JButton("OK");
	    getRootPane().setDefaultButton(okButton);
	    okButton.setActionCommand("OK");
	    if (okListener != null) {
	      okButton.addActionListener(okListener);
	    }
	    okButton.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	        setVisible(false);
	      }
	    }
	    );
	    buttonPane.add(okButton);

	    contentPane.add(buttonPane, BorderLayout.SOUTH);

	    pack();
	    setLocationRelativeTo(component);
	  }
}

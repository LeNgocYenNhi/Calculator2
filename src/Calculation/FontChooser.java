package Calculation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;



import java.awt.event.ActionListener;


import javax.swing.Box;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FontChooser extends JComponent
{
	 private InputPanel m_inputPane;
 
  public static void main(String[] args) {
    Font font = FontChooser.showDialog( 
                    (Component)null, "Font");
    System.out.println("Font: " + font);
  }

  public static Font showDialog(Component parent, String title) {
    final FontChooser pane = new FontChooser();

    FontTracker ok = new FontTracker(pane);

    JDialog dialog = 
        createDialog(parent, title, true, // modal
                     pane, ok, null // No cancel listener
        );
    
    dialog.setVisible(true); 

    return ok.getSelectedFont();
  }
  public static JDialog createDialog(
              Component parent, String title,
              boolean modal,
              FontChooser chooserPane,
              ActionListener okListener,
              ActionListener cancelListener)
  {
    return new FontChooserDialog(
              parent, title, modal, chooserPane,
              okListener, cancelListener);
  }

  public FontChooser() {
    setLayout(new BorderLayout());
    
    PreviewPanel previewPane = new PreviewPanel();
    m_inputPane = new InputPanel(previewPane); 
   
    add(m_inputPane, BorderLayout.CENTER);
    add(previewPane, BorderLayout.SOUTH);
  }

 
  public Font getSelectedFont()
  {
    return m_inputPane.getSelectedFont();
  }


class PreviewPanel extends JPanel implements ListSelectionListener{
	public PreviewPanel() {
		setLayout(new FlowLayout());

		Box box = Box.createVerticalBox();
		JLabel previewLabel = new JLabel("Preview:");
		box.add(previewLabel);
		m_text.setEditable(false);
		m_text.setBackground(Color.white);
		m_text.setForeground(Color.black);
		JScrollPane pane = new JScrollPane(m_text);
		pane.setPreferredSize(new Dimension(300, 80));
		box.add(pane);

		add(box);
	}
	public void valueChanged(ListSelectionEvent ev) {
		m_text.setFont(FontChooser.this.getSelectedFont());
	}

	private JTextField m_text = new JTextField("The quick brown fox jumps over the lazy dog");
	}
    
}

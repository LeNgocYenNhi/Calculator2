package Calculation;

import java.awt.*;
import javax.swing.*;

public class Menu {
	JMenuBar menuBar = new JMenuBar();
	JMenu Calculator = new JMenu("Calculator"), Convert = new JMenu("Convert"), Setting = new JMenu("Setting");
	JMenuItem Standard = new JMenuItem("Standard"), Scientific = new JMenuItem("Scientific"), Length = new JMenuItem("Length"), Weight = new JMenuItem("Weight");
	JMenuItem menuItem [] = {Standard, Scientific, Length, Weight};
	JMenu Menu[] = {Calculator, Convert, Setting};
	
	Color BG_COLOR = Color.WHITE;
	int WIDTH, HEIGHT;
	int X, Y;
	MenuItemListener menuItemListener = new MenuItemListener();
	public Menu(){
        menuBar.setBackground(getBG_COLOR());
        creatMenu();
        creatMenuItem();
   }
    public void creatMenu() {
    	  for(JMenu menu : Menu) {
        	  menuBar.add(menu);
        }
    	
    }
  
    public void creatMenuItem() {
        addItem(Calculator, Standard);
        addItem(Calculator, Scientific);
        addItem(Convert, Length);
        addItem(Convert, Weight);
        for(JMenuItem _menuItem : menuItem) {
        	_menuItem.addActionListener(menuItemListener);
        }
    }
  
    public void addItem(JMenu Menu,  JMenuItem menuItem) {
    	  Menu.add(menuItem);
    }
  
    public void setBounds(int x, int y, int Width, int Height) {
    	  this.menuBar.setBounds(x, y, Width, Height);
    }
  
	  public JMenuBar getMenuBar() {
		    return menuBar;
	  }
	  public void setMenuBar(JMenuBar menuBar) {
		    this.menuBar = menuBar;
	  }
	  public Color getBG_COLOR() {
		    return BG_COLOR;
	  }
	  public void setBG_COLOR(Color bG_COLOR) {
		    BG_COLOR = bG_COLOR;
	  }
	  public int getWIDTH() {
		    return WIDTH;
	  }
	  public void setWIDTH(int wIDTH) {
		    WIDTH = wIDTH;
	  }
	  public int getHEIGHT() {
		    return HEIGHT;
	  }
	  public void setHEIGHT(int hEIGHT) {
		    HEIGHT = hEIGHT;
	  }
	  public int getX() {
		    return X;
	  }
	  public void setX(int x) {
		    X = x;
	  }
	  public int getY() {
		    return Y;
	  }
	  public void setY(int y) {
		    Y = y;
	  }
	  public void setFont(Font f) {
		    this.menuBar.setFont(f);
	  }
   
}

package Calculation;

import javax.swing.*;

public class Menu extends Panel {
	JMenuBar menuBar = new JMenuBar();
	JMenu Calculator = new JMenu("Calculator"), Convert = new JMenu("Convert"), Setting = new JMenu("Setting");
	JMenuItem Standard = new JMenuItem("Standard"), Scientific = new JMenuItem("Scientific"), Length = new JMenuItem("Length"), Weight = new JMenuItem("Weight");
	JMenuItem menuItem [] = {Standard, Scientific, Length, Weight};
	JMenu Menu[] = {Calculator, Convert, Setting};

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
    @Override
    public void setBounds(int x, int y, int Width, int Height) {
    	this.menuBar.setBounds(x, y, Width, Height);
    }
    public JMenuBar getMenuBar() {
	  return menuBar;
    }
    public void setMenuBar(JMenuBar menuBar) {
	  this.menuBar = menuBar;
    }   
}

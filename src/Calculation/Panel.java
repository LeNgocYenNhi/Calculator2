package Calculation;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;

public class Panel {
	private int X, Y;
	private int WIDTH, HEIGHT;
	private Color BG_COLOR = Color.WHITE;
	JTextArea Panel = new JTextArea();
	public Panel() {
		
	}
	public void setX(int X) {
		  this.X = X;
	}
	public int getX() {
		  return X;
	}
	public void setY(int Y) {
		  this.Y = Y;
	}
	public int getY() {
		  return Y;
	}
	public void setHEIGHT(int HEIGHT) {
		  this.HEIGHT = HEIGHT;
	}
	public int getHEIGHT() {
		  return HEIGHT;
	}
	public void setWIDTH(int WIDTH) {
		  this.WIDTH = WIDTH;
	}
	public int getWIDTH() {
		  return WIDTH;
	}
	public Color getBG_COLOR() {
		  return BG_COLOR;
	}

	public void setBG_COLOR(Color BG_COLOR) {
		  this.BG_COLOR = BG_COLOR;
	}
	public void setFont(Font f){
		  this.Panel.setFont(f);
	}

	public void setText(String text){
		  this.Panel.setText(text);
	}

	public String getText(){
		  return this.Panel.getText();
	}

	public void setPanel(JTextArea panel) {
		  Panel = panel;
	}
	public JTextArea getPanel() {
		  return Panel;
	}
	public void setBounds(int x, int y, int width, int height){
		  this.Panel.setBounds(x, y, width, height);
	}
  
}

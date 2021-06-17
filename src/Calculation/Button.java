package Calculation;

import java.awt.Color;
import java.awt.Font;

public class Button {
	private int X, Y;
	private int WIDTH, HEIGHT;
	private Color BG_COLOR = Color.WHITE;
	private Font _Font = new Font("NewellsHand", Font.PLAIN, 30) ;
	
	public Button() {
		
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public void setWIDTH(int WIDTH) {
		this.WIDTH = WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
	public void setHEIGHT(int HEIGHT) {
		this.HEIGHT = HEIGHT;
	}
	public Color getBG_COLOR() {
		return BG_COLOR;
	}
	public void setBG_COLOR(Color BG_COLOR) {
		this.BG_COLOR = BG_COLOR;
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
	public void setFont(Font _Font) {
		this._Font= _Font;
	}
	public Font getFont() {
		return this._Font;
	}
	
}

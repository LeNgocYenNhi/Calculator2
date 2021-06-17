package Calculation;
import javax.swing.*;

public class OperatorButton extends Button{

	JButton add = new JButton(), sub = new JButton(), mul = new JButton(), div = new JButton();
	JButton dot = new JButton(), equ = new JButton(), del = new JButton(), clr = new JButton();
	JButton sqrt = new JButton(), neg = new JButton();
	JButton sin = new JButton(), cos = new JButton(), tan = new JButton(), cot = new JButton();
	JButton sqr = new JButton(), abs = new JButton(), pow = new JButton(), fac = new JButton();
	JButton e = new JButton(), pi = new JButton();
	JButton ln = new JButton(), log = new JButton(), pow10 = new JButton(), round = new JButton(), mod = new JButton();

	JButton Buttons[] = {
		add, sub, mul, div, dot, mod, del, clr,
		sqrt, neg, sin, cos, tan, cot, sqr, abs, 
		pow, fac, e, pi, ln, log, pow10, round, equ
	};
	
	public OperatorButton(){
		createOperatorButton();
	}

	public void createOperatorButton() {
        String path = System.getProperty("user.dir");

		add.setText("+");
		sub.setText("-");
		mul.setText("\u00D7");
		div.setText("\u00F7");
		dot.setText(".");
		mod.setText("mod");
		sin.setText("sin");
		cos.setText("cos");
		tan.setText("tan");
		pow.setIcon(new ImageIcon(path + "/images/pow.png"));
		cot.setText("cot");
		e.setText("e");
		pi.setText("\u03C0");
		sqr.setIcon(new ImageIcon(path + "/images/sqr.png"));
		sqrt.setText("\u221A");
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		fac.setText("n!");
		round.setText("x");
		abs.setIcon(new ImageIcon(path + "/images/abs.png"));
		clr.setIcon(new ImageIcon(path + "/images/clear.png"));
		neg.setText("\u00B1");
		ln.setText("ln");
		log.setText("log");
		pow10.setText("x^10");
		del.setIcon(new ImageIcon(path + "/images/delete.png"));
		equ.setText("="); 

		for(JButton operButton : Buttons) {
			operButton.setBackground(getBG_COLOR());
			operButton.setFont(getFont());
		}
	}

	public void setOperatorButton() {
		for(JButton operButton : Buttons) {
			operButton.setBackground(getBG_COLOR());
			operButton.setFont(getFont());
		}
	}
    
}

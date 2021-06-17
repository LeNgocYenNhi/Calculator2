package Calculation;

import java.awt.Font;

public class ConvertingPanel extends Panel {
	
	private double Values[] = new double[100];
	char sign[] = new char[100];
	int nValues = 0;
	
	
	public ConvertingPanel(){
		this.Panel.setBackground(getBG_COLOR());
		this.Panel.setBounds(10, 50, 1440, 90);
		this.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 10));
	}
	
	public void setValue(double value) {
		this.Values[nValues] = value;
	}
	public void resetValue(){
		for (int i = 0; i < 100; i++){
			this.Values[i] = 0;
			sign[i] = '+';
		}
		this.nValues = 0;
	}
	public double getGlobalValue(){
	
		double result = this.Values[0];
		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '.'){
				double value = this.Values[i + 1];
				while(value > 1){
					value /= 10.0;
				}
				this.Values[i] += value;
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
			}
		}
		result = (double) Math.round(result * 1000000000) / 1000000000;
		return result;

	}
}

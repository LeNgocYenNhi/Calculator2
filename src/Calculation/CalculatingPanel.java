package Calculation;

import java.awt.*;

public class CalculatingPanel extends Panel{

	
	private double Values[] = new double[100];
	char sign[] = new char[100];
	int nValues = 0;
	boolean EndExpression = false;

	
	CalculatingPanel(){
		this.Panel.setBackground(getBG_COLOR());
		this.Panel.setBounds(10, 50, 700, 110);
		this.Panel.setFont(new Font("NewellsHand", Font.PLAIN, 10));
	}

	public void setValue(double value){
		this.Values[nValues] = value;
	}

	public void resetValue(){
		for (int i = 0; i < 6; i++){
			this.Values[i] = 0;
			sign[i] = '+';
		}
		this.nValues = 0;
	}

	public double getGlobalValue(){
		
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

		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '^'){
				double value = Math.pow(this.Values[i], this.Values[i + 1]);
				this.Values[i] = value;
				this.Values[i + 1] = 1;
				this.sign[i] = '*';
			}
		}
		for (int i = 0; i < nValues; i++) {
			if (sign[i] == 'C'){
				double value = factorial((int) this.Values[i]) / (factorial((int) this.Values[i+1]) * factorial((int) (this.Values[i] - this.Values[i+1])));
				this.Values[i] = value;
				this.Values[i + 1] = 1;
				this.sign[i] = 'C';
			}
		}

		for (int i = 0; i < nValues; i++) {
			if (sign[i] == '*'){
				this.Values[i] *= this.Values[i + 1];
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
				i -= 1;
				continue;
			}
			if (sign[i] == '/'){
				this.Values[i] /= this.Values[i + 1];
				for (int j = i + 1; j < this.nValues; j++) {
					this.Values[j] = this.Values[j + 1];
					this.sign[j - 1] = this.sign[j];
				}
				this.nValues -= 1;
				i -= 1;
				continue;
			}
		}
		
		double result = this.Values[0];

		for (int i = 0; i < nValues; i++){
			if (sign[i] == '+'){
				result += this.Values[i + 1];
			}
			if (sign[i] == '-'){
				result -= this.Values[i + 1];
			}
		}
		result = (double) Math.round(result * 1000000000) / 1000000000;
		return result;
	}

	public double getValue(){
		double result = this.Values[nValues];
		return result;
	}

	boolean ValidateExpression(String expression){
		return true;
	}
	public double factorial(int number) {
		double result = 1;
		if (number >= 0) {
			for(int i = 1; i <= number; i++) {
				result *= i;
			}
		return result;
		}
		return -1;
	}


}

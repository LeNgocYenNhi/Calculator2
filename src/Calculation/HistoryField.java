package Calculation;

import java.util.*;
import java.util.List;


public class HistoryField extends Panel{ 

	private List<String> list = new ArrayList<String>();  
	
	public HistoryField (){
		this.Panel.setBounds(720,50, 350, 655);	
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	

	public void clear(){
		this.list = new ArrayList<String>();  
	}

	public void add(String his){
		this.list.add(his);
	}

	public void show(){ 
		String s = "";
		
		for(String item:list)  {
			s = item + "\n" + s;
		}
		
		Panel.setText(s);
	}
}

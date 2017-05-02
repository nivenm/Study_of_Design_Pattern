package mediator;

import java.awt.Button;

public class NumericButton extends Button {
	private int value;
	private String caption; 
	public String getCaption() {
		return caption;
	}

	public int getValue() {
		value = Integer.parseInt(caption);
		return value;
	}
	
	public NumericButton(String text){
		this.caption =text;
		init();
	}
	
	private void init(){
		setLabel(caption);
		
	}
}

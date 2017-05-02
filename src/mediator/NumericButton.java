package mediator;

import javax.swing.JButton;

public class NumericButton extends JButton {
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
		setText(caption);
		
	}
}

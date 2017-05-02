package mediator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButton extends Button implements ActionListener {
	private Mediator mediator;
	private String value;
	private String caption; 
	public String getCaption() {
		return caption;
	}

	public String getValue() {
		value =caption;
		return value;
	}
	
	public NumericButton(String text,Mediator mediator){
		this.mediator=mediator;
		this.caption =text;
		init();
	}
	
	private void init(){
		setLabel(caption);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mediator.processEvent( e);
	}
	
}

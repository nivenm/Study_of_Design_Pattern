package mediator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationButton extends Button implements ActionListener{
	private Mediator mediator;
	private String caption; 
	public String getCaption() {
		return caption;
	}
	
	public OperationButton(String text,Mediator mediator){
		this.caption =text;
		init();
	}
	
	private void init(){
		setLabel(caption);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mediator.processEvent(e);
		
	}
}

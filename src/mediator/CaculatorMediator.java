package mediator;

import java.awt.Label;
import java.awt.event.ActionEvent;

public class CaculatorMediator extends Mediator {
	private String Number="";
	private String Operation="";
	private Label labelField;

	public void setLabelField(Label labelField) {
		this.labelField = labelField;
	}

	@Override
	public void processEvent(ActionEvent e) {
		if(e.getSource() instanceof NumericButton){
			NumericButton button = (NumericButton) e.getSource();
			Number += button.getValue();
			labelField.setText(Number);		
		}
		if(e.getSource() instanceof OperationButton){
			OperationButton button = (OperationButton) e.getSource();
			Operation = button.getCaption();
		}
	}

}

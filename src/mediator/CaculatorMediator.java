package mediator;

import java.awt.Label;
import java.awt.event.ActionEvent;

import simple_factory.Operation;
import simple_factory.OperationFactory;
/**
 * 本例中的抽象类负责知晓所有界面上的控件并赋予他们逻辑关系
 * @author wangth89
 *
 */
public class CaculatorMediator extends Mediator {
	private String curNumber="",preNumber="";
	private String CurOp="",preOp="";
	private Label labelField;
	private Operation op;

	public void setLabelField(Label labelField) {
		this.labelField = labelField;
	}

	@Override
	public void processEvent(ActionEvent e) {
		if(e.getSource() instanceof NumericButton){
			NumericButton button = (NumericButton) e.getSource();
			curNumber += button.getValue();
			labelField.setText(curNumber);		
		}
		if(e.getSource() instanceof OperationButton){
			OperationButton button = (OperationButton) e.getSource();
			CurOp = button.getCaption();
			if("=".equals(button.getCaption())){
				op = OperationFactory.creatOperationInstance(preOp);
				caculator();
				preOp="";
			}else{
				if("".equals(preOp)){
					op = OperationFactory.creatOperationInstance(CurOp);
					preNumber= labelField.getText();
					op.setNumberA(Double.parseDouble(preNumber));
					curNumber="";
				}else{
					op = OperationFactory.creatOperationInstance(preOp);
					op.setNumberA(Double.parseDouble(preNumber));
					caculator();
				}
				preOp=CurOp;
			}
			op=null;
		}
	}
	
	private void caculator() {
		if (op == null) {
			labelField.setText(curNumber);
			return;
		}
		curNumber=labelField.getText();
		op.setNumberA("".equals(preNumber) ? 0.0 : Double.parseDouble(preNumber));
		op.setNumberB("".equals(curNumber) ? 0.0 : Double.parseDouble(curNumber));
		preNumber =String.valueOf(op.getResult());
		labelField.setText(preNumber);
		curNumber="";
	}

}

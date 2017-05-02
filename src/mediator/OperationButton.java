package mediator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * �Ӽ��˳����ڵĲ�����ť��
 * ͨ�����캯���������н���
 * �����¼��е����н���
 * �൱�ڸ�ģʽ�е�Colleague
 * @author wangth89
 *
 */
public class OperationButton extends Button implements ActionListener{
	private Mediator mediator;
	private String caption; 
	public String getCaption() {
		return caption;
	}
	
	public OperationButton(String text,Mediator mediator){
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
		mediator.processEvent(e);
		
	}
}

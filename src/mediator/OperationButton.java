package mediator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 加减乘除等于的操作按钮类
 * 通过构造函数来引入中介器
 * 并在事件中调用中介器
 * 相当于该模式中的Colleague
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

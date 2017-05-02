package mediator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 0~9以及小数点按钮 类
 * 通过构造函数来引入中介器
 * 并在事件中调用中介器
 * 相当于改模式中的Colleague
 * @author wangth89
 *
 */
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

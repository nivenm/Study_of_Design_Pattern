package mediator;

import java.awt.event.ActionEvent;
/**
 * 中介器的抽象类或者接口
 * @author wangth89
 *
 */
public abstract class Mediator { 
	public abstract void processEvent(ActionEvent e);
}

package command;

import java.util.ArrayList;
import java.util.List;
/**
 * �൱�ڸ�ģʽ�е�Invoker��
 * ������� ���е�����
 * @author wangth89
 *
 */
public class Waiter {
	private List<Command> commands = new ArrayList<Command>();

	public void setOrders(Command command) {
		if (command instanceof BakeChickenWings) {
			System.out.println("û�м�����");
		} else {
			commands.add(command);
		}
	}

	public void cancelOrders(Command command) {
		commands.remove(command);
	}

	public void notifyAllCommand() {
		for (Command c : commands)
			c.ExecuteCommand();
	}
}

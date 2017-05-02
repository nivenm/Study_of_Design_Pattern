package command;

import java.util.ArrayList;
import java.util.List;
/**
 * 相当于该模式中的Invoker类
 * 负责管理 所有的命令
 * @author wangth89
 *
 */
public class Waiter {
	private List<Command> commands = new ArrayList<Command>();

	public void setOrders(Command command) {
		if (command instanceof BakeChickenWings) {
			System.out.println("没有鸡翅了");
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

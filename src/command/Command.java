package command;
/**
 * 所有命令类的抽象类或者接口
 * @author wangth89
 *
 */
public abstract class Command {
	protected Barbecuer reciever;

	public Command(Barbecuer reciever) {
		this.reciever = reciever;
	}
	
	abstract public void ExecuteCommand();
}
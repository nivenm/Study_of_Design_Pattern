package command;
/**
 * ����������ĳ�������߽ӿ�
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
package command;
/**
 * 具体的命令类
 * @author wangth89
 *
 */
public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Barbecuer reciever) {
		super(reciever);
	}

	@Override
	public void ExecuteCommand() {
		super.reciever.bakeMutton();
	}

}

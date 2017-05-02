package command;
/**
 *  具体的命令类
 * @author wangth89
 *
 */
public class BakeChickenWings extends Command {

	public BakeChickenWings(Barbecuer reciever) {
		super(reciever);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ExecuteCommand() {
		super.reciever.bakeChickenWings();
	}

}

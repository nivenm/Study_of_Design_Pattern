package factory;
/**
 *学雷锋的大学生
 * @author wangth89
 *
 */
public class Undergraduate implements ILeifeng {

	@Override
	public void sweep() {
		System.out.println("扫地");

	}

	@Override
	public void wash() {
		System.out.println("洗衣服");
	}

	@Override
	public void buyRice() {
		System.out.println("买米");
	}

}

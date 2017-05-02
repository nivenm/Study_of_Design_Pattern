package adapter;
/**
 * 前锋类
 * @author wangth89
 *
 */
public class Forward extends Player {

	public Forward(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("前锋:" + this.name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("前锋:" + this.name + "防守");
	}

}

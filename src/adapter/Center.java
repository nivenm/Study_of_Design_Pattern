package adapter;
/**
 * 中锋类
 * @author wangth89
 *
 */
public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("中锋:" + this.name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("中锋:" + this.name + "防守");
	}

}

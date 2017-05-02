package adapter;
/**
 * 后卫类
 * @author wangth89
 *
 */
public class Guard extends Player {

	public Guard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("后卫:" + this.name + "进攻");
	}

	@Override
	public void defense() {
		System.out.println("后卫:" + this.name + "防守");
	}

}

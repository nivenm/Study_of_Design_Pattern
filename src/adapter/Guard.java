package adapter;
/**
 * ������
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
		System.out.println("����:" + this.name + "����");
	}

	@Override
	public void defense() {
		System.out.println("����:" + this.name + "����");
	}

}

package adapter;
/**
 * ǰ����
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
		System.out.println("ǰ��:" + this.name + "����");
	}

	@Override
	public void defense() {
		System.out.println("ǰ��:" + this.name + "����");
	}

}

package adapter;
/**
 * �з���
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
		System.out.println("�з�:" + this.name + "����");
	}

	@Override
	public void defense() {
		System.out.println("�з�:" + this.name + "����");
	}

}

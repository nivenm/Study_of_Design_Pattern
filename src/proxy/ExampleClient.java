package proxy;
/**
 * ������ҵ��С��æµ��һ��
 * @author wangth89
 *
 */
public class ExampleClient {

	public static void main(String[] args) {
		Girl daniu = new Girl();
		daniu.setName("���");
		Proxy persuitPorxy = new Proxy(daniu);
		persuitPorxy.giveiphone();
		persuitPorxy.giveFlowers();
		persuitPorxy.giveChocolate();
		
	}

}

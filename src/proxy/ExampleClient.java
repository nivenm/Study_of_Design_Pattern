package proxy;
/**
 * 即将毕业的小明忙碌的一天
 * @author wangth89
 *
 */
public class ExampleClient {

	public static void main(String[] args) {
		Girl daniu = new Girl();
		daniu.setName("大妞");
		Proxy persuitPorxy = new Proxy(daniu);
		persuitPorxy.giveiphone();
		persuitPorxy.giveFlowers();
		persuitPorxy.giveChocolate();
		
	}

}

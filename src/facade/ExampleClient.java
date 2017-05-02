package facade;
/**
 * 客户类。客户只需知晓基金。
 * @author wangth89
 *
 */
public class ExampleClient {

	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.Buy();
		fund.Sell();
	}

}

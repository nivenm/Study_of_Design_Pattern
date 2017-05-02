package facade;
/**
 * 股票类 中石化
 * @author wangth89
 *
 */
public class Stock2 implements IFinancialProductsOperator {

	@Override
	public void Sell() {
		System.out.println("卖出 中石化");
	}

	@Override
	public void Buy() {
		// TODO Auto-generated method stub
		System.out.println("买进 中石化");
	}

}

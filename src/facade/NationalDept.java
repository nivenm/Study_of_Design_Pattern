package facade;
/**
 * ĳĳ��ծ
 * @author wangth89
 *
 */
public class NationalDept implements IFinancialProductsOperator {

	@Override
	public void Sell() {
		System.out.println("���� ĳĳ��ծ");
	}

	@Override
	public void Buy() {
		System.out.println("��� ĳĳ��ծ");		
	}

}

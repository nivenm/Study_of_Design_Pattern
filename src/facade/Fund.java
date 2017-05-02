package facade;
/**
 * ��������ϻ����� �͵���������ģʽ�е�Facade��
 * �ͻ�ֻ��Ҫ�����������������Ͷ�ʣ���������Ҫ֪��������𵽵�������Щ��Ʊ����ծȯ��Ʒ��
 * ���������Ͷ������������Ʋ�Ʒ��
 * @author wangth89
 *
 */
public class Fund implements IFinancialProductsOperator {

	Stock1 zsy = new Stock1();
	Stock2 zsh = new Stock2();
	NationalDept guozhai =new NationalDept(); 
	@Override
	public void Sell() {
		zsy.Sell();
		zsh.Sell();
		guozhai.Sell();
	}

	@Override
	public void Buy() {
		zsy.Buy();
		zsh.Buy();
		guozhai.Buy();
	}

}

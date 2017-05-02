package builder;
/**
 * �������������ֲᣬ
 * ��������������ֲᶼ��Ҫ��ѭ��������������ۣ�
 * ����Ͳ��������ˣ��������±���Ҳ��������ͷ����������������⴫��
 * @author wangth89
 *
 */
public class SeafoodPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		super.pizza.setDough("��׼��������");
	}

	@Override
	public void buildSauce() {
		super.pizza.setSauce("��׼֥ʿ");
	}

	@Override
	public void buildTopping() {
		super.pizza.setTopping("���ֺ���");
	}

}

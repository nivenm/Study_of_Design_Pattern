package builder;
/**
 * ˮ��ζ���������ֲᣬ
 * ��������������ֲᶼ��Ҫ��ѭ��������������ۣ�
 * ����Ͳ��������ˣ��������±���Ҳ��������ͷ����������������⴫��
 * @author wangth89
 *
 */
public class FruitPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		super.pizza.setDough("��׼��������");
	}

	@Override
	public void buildSauce() {
		super.pizza.setSauce("��ζ֥ʿ");
	}

	@Override
	public void buildTopping() {
		super.pizza.setTopping("����ˮ����");
	}

}

package builder;
/**
 * �������Ϊ�������������ۡ�
 * ���� �涨��Pizza��Ҫ����ɲ��֣����� �ײ������ţ�֥ʿ����,����������
 * ������ʲô���ݲ�ͬ����� ����������
 * @author wangth89
 *
 */
public abstract class PizzaBuilder {
	protected Pizza pizza = new Pizza();

	public Pizza getPizza() {
		return pizza;
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	
}

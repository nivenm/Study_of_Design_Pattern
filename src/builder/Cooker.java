package builder;
/**
 * �������ĳ�ʦ
 * ������ģʽ�е�Director
 * @author wangth89
 *
 */
public class Cooker {
public void makePizza(PizzaBuilder pizzaBuilder){
	/**
	 * ����������Director�Ĺ���
	 * һ������ס�����������Ҫ��Ҫ�أ���Ҫ��һ�������������ף�֥ʿ���ϣ�������� ������Ԫ��һ��Ҳ�����١�
	 * ��������ס�����������õ��Ⱥ�˳�������������Ȱ������� ����������������Ϳ������֥ʿ���ϣ��ٷ���ˣ��ٿ��� 
	 */
	pizzaBuilder.buildDough();
	pizzaBuilder.buildSauce();
	pizzaBuilder.buildTopping();
}
}

package builder;

public class ExampleClient {

	public static void main(String[] args) {
		//����и���ʦ
		Cooker cooker = new Cooker();
		/**
		 * �˿͵���һ��ˮ������
		 */
		//�ҵ�ˮ�������������ֲ�
		PizzaBuilder pb = new FruitPizzaBuilder();
		//��ʦ�����ֲ�����������
		cooker.makePizza(pb);
		Pizza fruitPizza =pb.getPizza();
		fruitPizza.show();
		
		/**
		 * ��һ���Ŀͻ�����һ����������
		 */
		//�ҵ����������������ֲ�
		PizzaBuilder sfpb = new SeafoodPizzaBuilder();
		//�����ֲ�������������
		cooker.makePizza(sfpb);
		Pizza seafoodPizza =sfpb.getPizza();
		seafoodPizza.show();
		
	}

}

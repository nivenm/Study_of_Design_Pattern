package visitor;
/**
 * ����visitor��
 * @author WangTianHai
 *
 */
public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("��������ʱ�����²���ҲҪװ��");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("Ů������ʱ�����¶�Ҳװ������");
	}

}

package visitor;
/**
 * ����visitor��
 * @author WangTianHai
 *
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("���˳ɹ�ʱ����������һ��ΰ���Ů��");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("Ů�˳ɹ�ʱ����������һ�����ɹ�������");
	}

}

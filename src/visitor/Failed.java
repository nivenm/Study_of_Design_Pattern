package visitor;
/**
 * ����visitor��
 * @author WangTianHai
 *
 */
public class Failed extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("����ʧ��ʱ����ͷ�Ⱦ�˭Ҳ����Ȱ");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("Ů��ʧ��ʱ����������˭ҲȰ����");
	}

}

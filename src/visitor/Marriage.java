package visitor;
/**
 * ����visitor��
 * @author WangTianHai
 *
 */
public class Marriage extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("���˽��ʱ����������");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("Ů�˽��ʱ����������");

	}

}

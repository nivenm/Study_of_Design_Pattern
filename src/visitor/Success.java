package visitor;
/**
 * 具体visitor类
 * @author WangTianHai
 *
 */
public class Success extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("男人成功时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("女人成功时，背后大多有一个不成功的男人");
	}

}

package visitor;
/**
 * 具体visitor类
 * @author WangTianHai
 *
 */
public class Marriage extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("男人结婚时，。。。。");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("女人结婚时。。。。。");

	}

}

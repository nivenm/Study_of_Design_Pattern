package visitor;
/**
 * 具体visitor类
 * @author WangTianHai
 *
 */
public class Failed extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("男人失败时，闷头喝酒谁也不用劝");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("女人失败时，眼泪汪汪谁也劝不了");
	}

}

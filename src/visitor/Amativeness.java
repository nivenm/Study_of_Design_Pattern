package visitor;
/**
 * 具体visitor类
 * @author WangTianHai
 *
 */
public class Amativeness extends Action {

	@Override
	public void getManConclusion(Man ConcreteElementA) {
		System.out.println("男人恋爱时，凡事不懂也要装懂");
	}

	@Override
	public void getWomanConclusion(Woman ConcreteElementA) {
		System.out.println("女人恋爱时，遇事懂也装作不懂");
	}

}

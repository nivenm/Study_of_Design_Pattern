package visitor;
/**
 * ����Element��
 * @author WangTianHai
 *
 */
public class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		 visitor.getWomanConclusion(this);
	}

}

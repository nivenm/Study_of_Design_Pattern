package interpreter;
/**
 * ���ٽ�����
 * @author WangTianHai
 *
 */
public class Speed extends Expression {

	@Override
	public void excute(String Key, double value) {
		String speed;
		if(value<500)
			speed="����";
		else if(value>=1000)
			speed="����";
		else
			speed="����";
		System.out.print(speed);
		
	}

}

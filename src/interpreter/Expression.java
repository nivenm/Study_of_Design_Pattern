package interpreter;

/**
 * ���н������ĳ�������߽ӿ�
 *
 */
public abstract class Expression {
	//��ĳ�ָ�ʽ������������
	public void Interpret(PlayContext context){
		if(context.getPlaytext().length()>0){
			String PlayKey = context.getPlaytext().substring(0, 1);
			context.setPlaytext(context.getPlaytext().substring(2));
			double PlayValue = Double.parseDouble(context.getPlaytext().substring(0, context.getPlaytext().indexOf(" ")));
			context.setPlaytext(context.getPlaytext().substring( context.getPlaytext().indexOf(" ")+1));
			excute(PlayKey,PlayValue);
		}
	}
	//�������ĳ�����Ŵ���ʲô
	public abstract void excute(String Key,double value);
}

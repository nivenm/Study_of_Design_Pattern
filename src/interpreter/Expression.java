package interpreter;

/**
 * 所有解释器的抽象父类或者接口
 *
 */
public abstract class Expression {
	//按某种格式解释音符代码
	public void Interpret(PlayContext context){
		if(context.getPlaytext().length()>0){
			String PlayKey = context.getPlaytext().substring(0, 1);
			context.setPlaytext(context.getPlaytext().substring(2));
			double PlayValue = Double.parseDouble(context.getPlaytext().substring(0, context.getPlaytext().indexOf(" ")));
			context.setPlaytext(context.getPlaytext().substring( context.getPlaytext().indexOf(" ")+1));
			excute(PlayKey,PlayValue);
		}
	}
	//具体解释某个符号代表什么
	public abstract void excute(String Key,double value);
}

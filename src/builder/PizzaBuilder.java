package builder;
/**
 * 可以理解为《披萨制作概论》
 * 概论 规定了Pizza必要的组成部分：包括 底部的面团，芝士酱料,和上面的配菜
 * 具体是什么根据不同种类的 披萨来决定
 * @author wangth89
 *
 */
public abstract class PizzaBuilder {
	protected Pizza pizza = new Pizza();

	public Pizza getPizza() {
		return pizza;
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
	
	
}

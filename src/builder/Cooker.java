package builder;
/**
 * 做披萨的厨师
 * 建造者模式中的Director
 * @author wangth89
 *
 */
public class Cooker {
public void makePizza(PizzaBuilder pizzaBuilder){
	/**
	 * 这里提现了Director的功能
	 * 一、限制住建造对象所需要的要素：想要做一个披萨，披萨底，芝士酱料，还有配菜 着三大元素一个也不能少。
	 * 二、限制住各个方法调用的先后顺序：做披萨必须先把披萨底 烤出来，再在上面涂上做好芝士酱料，再放配菜，再烤制 
	 */
	pizzaBuilder.buildDough();
	pizzaBuilder.buildSauce();
	pizzaBuilder.buildTopping();
}
}

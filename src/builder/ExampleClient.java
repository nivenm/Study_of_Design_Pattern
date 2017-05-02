package builder;

public class ExampleClient {

	public static void main(String[] args) {
		//这边有个厨师
		Cooker cooker = new Cooker();
		/**
		 * 顾客点了一个水果披萨
		 */
		//找到水果披萨的制作手册
		PizzaBuilder pb = new FruitPizzaBuilder();
		//厨师根据手册来做出披萨
		cooker.makePizza(pb);
		Pizza fruitPizza =pb.getPizza();
		fruitPizza.show();
		
		/**
		 * 另一桌的客户点了一个海鲜披萨
		 */
		//找到海鲜披萨的制作手册
		PizzaBuilder sfpb = new SeafoodPizzaBuilder();
		//根据手册煮做出鲜披萨
		cooker.makePizza(sfpb);
		Pizza seafoodPizza =sfpb.getPizza();
		seafoodPizza.show();
		
	}

}

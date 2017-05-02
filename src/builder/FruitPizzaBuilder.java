package builder;
/**
 * 水果味披萨制作手册，
 * 所有种类的披萨手册都需要遵循概论中提出的理论，
 * 否则就不是披萨了，可能是月饼，也可能是馒头（这个梗来自武林外传）
 * @author wangth89
 *
 */
public class FruitPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		super.pizza.setDough("标准披萨面团");
	}

	@Override
	public void buildSauce() {
		super.pizza.setSauce("果味芝士");
	}

	@Override
	public void buildTopping() {
		super.pizza.setTopping("各种水果丁");
	}

}

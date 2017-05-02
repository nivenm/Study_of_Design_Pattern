package iterator;

public class ExampleClient {

	public static void main(String[] args) {
		ConcreteAggregate concreteAgg = new ConcreteAggregate();
		concreteAgg.addConcreteAggregate("大鸟");
		concreteAgg.addConcreteAggregate("小菜");
		concreteAgg.addConcreteAggregate("行李");
		concreteAgg.addConcreteAggregate("老外");
		concreteAgg.addConcreteAggregate("公交内部员工");
		concreteAgg.addConcreteAggregate("小偷");
		
		Iterator it = new ConcreteIterator(concreteAgg);
		it.First();
		while (!it.IsDone()){
			System.out.println(it.CurrentItem()+"请买车票");
			it.Next();
		}
	}

}

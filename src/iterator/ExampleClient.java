package iterator;

public class ExampleClient {

	public static void main(String[] args) {
		ConcreteAggregate concreteAgg = new ConcreteAggregate();
		concreteAgg.addConcreteAggregate("����");
		concreteAgg.addConcreteAggregate("С��");
		concreteAgg.addConcreteAggregate("����");
		concreteAgg.addConcreteAggregate("����");
		concreteAgg.addConcreteAggregate("�����ڲ�Ա��");
		concreteAgg.addConcreteAggregate("С͵");
		
		Iterator it = new ConcreteIterator(concreteAgg);
		it.First();
		while (!it.IsDone()){
			System.out.println(it.CurrentItem()+"����Ʊ");
			it.Next();
		}
	}

}

package iterator;

public class ConcreteIterator extends Iterator {
private ConcreteAggregate aggregate;
private int current =0 ;
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object First() {
		return aggregate.getConcreteAggregate(0);
	}

	@Override
	public Object Next() {
		Object ret=null;
		current++;
		if(current<aggregate.count()){
			ret  = aggregate.getConcreteAggregate(current);
		}
		return ret;
	}

	@Override
	public boolean IsDone() {
		return current>=aggregate.count();
	}

	@Override
	public Object CurrentItem() {
		return aggregate.getConcreteAggregate(current);
	}

}

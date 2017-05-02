package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

	private List<Object> items = new ArrayList<Object>(); 
	@Override
	public Iterator createItrator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
		
	}
	
	public Object getConcreteAggregate(int index){
		return items.get(index);
	}
	
	public Object setConcreteAggregate(int index,Object obj){
		return items.set(index,obj);
	}
	
	public Object addConcreteAggregate(Object obj){
		return items.add(obj);
	}
	
	


}
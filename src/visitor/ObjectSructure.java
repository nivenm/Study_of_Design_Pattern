package visitor;

import java.util.ArrayList;
import java.util.List;
/**
 * 结构类负责管理Element
 * @author WangTianHai
 *
 */
public class ObjectSructure {
	private List<Person> elements  = new ArrayList<Person>();
	
	public void attach(Person p){
		elements.add(p);
	}
	
	public void Detach(Person p){
		elements.remove(p);
	}

	public void display(Action visitor){
		for(Person p:elements){
			p.accept(visitor);
		}
		
	}
}

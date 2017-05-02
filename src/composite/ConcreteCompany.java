package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Compsite类，负责对抽象组件进行实现
 * 可作为根节点或者树枝节点
 * @author wangth89
 *
 */
public class ConcreteCompany extends Company {
	private List<Company> children = new ArrayList<Company>();

	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void Add(Company c) {
		children.add(c);
	}

	@Override
	public void Remove(Company c) {
		children.remove(c);
	}

	@Override
	public void Display(int depth) {
		System.out.println(getMinusSymbol(depth) + name);
		for (Company c : children) {
			c.Display(depth + 2);
		}
	}

	@Override
	public void LineOfDuty() {
		for (Company c : children) {
			c.LineOfDuty();
		}

	}

}

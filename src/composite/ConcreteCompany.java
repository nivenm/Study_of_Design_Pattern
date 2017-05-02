package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Compsite�࣬����Գ����������ʵ��
 * ����Ϊ���ڵ������֦�ڵ�
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

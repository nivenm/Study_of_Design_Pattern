package composite;
/**
 * “叶”类作为末级节点 没有下级，也无法添加或者移除下级
 * @author wangth89
 *
 */
public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Add(Company c) {

	}

	@Override
	public void Remove(Company c) {

	}

	@Override
	public void Display(int depth) {
		System.out.println(super.getMinusSymbol(depth) + name);
	}

	@Override
	public void LineOfDuty() {
		System.out.println(name + "：员工培训管理");
	}

}

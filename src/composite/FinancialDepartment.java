package composite;
/**
 *  ��Ҷ������Ϊĩ���ڵ� û���¼���Ҳ�޷���ӻ����Ƴ��¼�
 * @author wangth89
 *
 */
public class FinancialDepartment extends Company {

	public FinancialDepartment(String name) {
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
		System.out.println(name + "����˾������֧����");
	}

}

package composite;

public class ExampleClient {
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.Add( new HRDepartment("�ܹ�˾������Դ��"));
		root.Add( new FinancialDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.Add(new HRDepartment("�Ϻ������ֹ�˾������Դ��"));
		comp.Add(new FinancialDepartment("�Ϻ������ֹ�˾����"));
		root.Add(comp);
		ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
		comp1.Add(new HRDepartment("�Ͼ����´�������Դ��"));
		comp1.Add(new FinancialDepartment("�Ͼ����´�����"));
		comp.Add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
		comp2.Add(new HRDepartment("���ݰ��´�������Դ��"));
		comp2.Add(new FinancialDepartment("���ݰ��´�����"));
		comp.Add(comp2);
		System.out.println("\n�ṹͼ");
		root.Display(1);
		System.out.println("\nְ��");
		root.LineOfDuty();
		
	}
}

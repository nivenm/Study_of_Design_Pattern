package simple_factory;

public class ExampleClient {

	public static void main(String[] args) {
		Operation op = OperationFactory.creatOperationInstance("+");
		op.setNumberA(1);
		op.setNumberB(2);
		System.out.println("�������ǣ�"+op.getResult());
	}

}

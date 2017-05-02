package template;

public class ExampleClient {

	public static void main(String[] args) {

		TestPaper tpA= new ForeignerATestPaper();
		TestPaper tpB= new ForeignerBTestPaper();
		System.out.println("------------------------考生A的答卷--------------------------");
		tpA.askQuestion1();
		tpA.askQuestion2();
		tpA.askQuestion3();
		tpA.askQuestion4();
		System.out.println("------------------------考生B的答卷--------------------------");
		tpB.askQuestion1();
		tpB.askQuestion2();
		tpB.askQuestion3();
		tpB.askQuestion4();
	}

}

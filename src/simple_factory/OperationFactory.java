package simple_factory;

public class OperationFactory {
	
	public static Operation creatOperationInstance(String symbol){
		Operation operation = null;
		switch(symbol){
		case "+":
			operation= new AddOperation(); 
		break;
		case "-":
			operation= new MinusOperation();
			break;
		case "*":
			operation= new MultiplyOperation();
			break;
		case "/":
			operation= new DivOperation();
			break;
		}
		return operation;
		
	}

}

package simple_factory;

import strategy.ChargeRebate;
import strategy.ChargeRetun;
import strategy.NormalCharge;

public class OperationFactory {
	
	public static Operation creatOperationInstance(String symbol){
		Operation operation = null;
//		switch(symbol){
//		case "+":
//			operation= new AddOperation(); 
//		break;
//		case "-":
//			operation= new MinusOperation();
//			break;
//		case "*":
//			operation= new MultiplyOperation();
//			break;
//		case "/":
//			operation= new DivOperation();
//			break;
//		}
		
		if("+".equals(symbol)){
			operation= new AddOperation(); 
		}else if("-".equals(symbol)){
			operation= new MinusOperation();
		}else if("*".equals(symbol)){
			operation= new MultiplyOperation();
		}else if("/".equals(symbol)){
			operation= new DivOperation();
		}
		return operation;
		
	}

}

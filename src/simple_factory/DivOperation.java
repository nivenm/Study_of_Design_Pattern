package simple_factory;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		
		try{
			return NumberA/NumberB;	
		}catch(ArithmeticException e) {
			e.printStackTrace();
			return 0;
		}
	}

}

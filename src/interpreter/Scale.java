package interpreter;

public class Scale extends Expression {

	@Override
	public void excute(String Key, double value) {
		String scale ="";
		switch(((Double)value).intValue()){
		case 1:
			scale="����";
			break;
		case 2:
			scale="����";
			break;
		case 3:
			scale="����";
			break;
		}	
	    System.out.print(scale);
	}

}

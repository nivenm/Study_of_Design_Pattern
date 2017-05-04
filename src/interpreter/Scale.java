package interpreter;

public class Scale extends Expression {

	@Override
	public void excute(String Key, double value) {
		String scale ="";
		switch(((Double)value).intValue()){
		case 1:
			scale="µÕ“Ù";
			break;
		case 2:
			scale="÷–“Ù";
			break;
		case 3:
			scale="∏ﬂ“Ù";
			break;
		}	
	    System.out.print(scale);
	}

}

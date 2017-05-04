package interpreter;

public class Note extends Expression {

	@Override
	public void excute(String Key, double value) {
		String note ="";
		if("C".equals(Key)){
			note="1";
		}else if("D".equals(Key)){
			note="2";
		}else if("E".equals(Key)){
			note="3";
		}else if("F".equals(Key)){
			note="4";
		}else if("G".equals(Key)){
			note="5";
		}else if("A".equals(Key)){
			note="6";
		}else if("B".equals(Key)){
			note="7";
		}
				
	    System.out.print(note);
	}

}

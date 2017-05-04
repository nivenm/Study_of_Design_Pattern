package interpreter;

public class ExampleClient {

	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		System.out.println("ÉÏº£Ì²£º");
		context.setPlaytext("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		try{
			while(context.getPlaytext().length()>0){
				String str  = context.getPlaytext().substring(0, 1);
				if("O".equals(str)){
					expression = new Scale();
				}else if("T".equals(str)){
					expression = new Speed();
				}else{
					expression = new Note();
				}
				expression.Interpret(context);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}

	}

}

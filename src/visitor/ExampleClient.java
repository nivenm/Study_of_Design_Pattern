package visitor;

public class ExampleClient {

	public static void main(String[] args) {
		ObjectSructure os= new ObjectSructure();
		os.attach(new Man());
		os.attach(new Woman());
		Success v1 = new Success();
		os.display(v1);
		
		Failed v2 = new Failed();
		os.display(v2);
		
		Amativeness v3 = new Amativeness();
		os.display(v3);
	
		Marriage v4 = new Marriage();
		os.display(v4);
		
	}

}

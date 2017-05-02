package decorator;

public class SuitDecorator extends ClothesDecorator {


	public SuitDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("穿了西装和西裤");
	}

}

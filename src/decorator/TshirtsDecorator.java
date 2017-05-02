package decorator;

public class TshirtsDecorator extends ClothesDecorator {


	public TshirtsDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("¥©¡À¥ÛT–Ù");
	}

}

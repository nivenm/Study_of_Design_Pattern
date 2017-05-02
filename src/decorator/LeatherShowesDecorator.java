package decorator;

public class LeatherShowesDecorator extends ClothesDecorator {


	public LeatherShowesDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("¥©¡À∆§–¨");
	}

}

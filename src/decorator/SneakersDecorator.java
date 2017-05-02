package decorator;

public class SneakersDecorator extends ClothesDecorator {


	public SneakersDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("¥©¡À‘À∂Ø–¨");
	}

}

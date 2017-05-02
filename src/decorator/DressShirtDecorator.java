package decorator;

public class DressShirtDecorator extends ClothesDecorator {


	public DressShirtDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("╢╘ак╟вЁдию");
	}

}

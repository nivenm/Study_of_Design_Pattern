package decorator;

public class BigTrouserDecorator extends ClothesDecorator {


	public BigTrouserDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("╢╘ак©Е©Ц");
	}

}

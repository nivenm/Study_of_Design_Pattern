package decorator;

public class SportsSuitDecorator extends ClothesDecorator {


	public SportsSuitDecorator(Apparel person) {
		super(person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		person.show();
		System.out.println("�����˶��º��˶���");
	}

}

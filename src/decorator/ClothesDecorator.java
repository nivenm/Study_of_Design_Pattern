package decorator;

public abstract class ClothesDecorator implements Apparel {
	protected Apparel person;

	public ClothesDecorator(Apparel person) {
		this.person = person;
	}

}

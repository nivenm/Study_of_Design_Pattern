package decorator;

public class Person implements Apparel {
private String name="";
	public Person(String name) {
		this.name = name;
	}
	@Override
	public void show() {
		System.out.println(name);
	}

}

package builder;

public class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";

	public void setDough(String dough) {
		this.dough = dough;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}
	public void show(){
		System.out.println("这款披萨有 "+dough+"底,"+sauce+"酱,"+topping+"配料");
	}
}

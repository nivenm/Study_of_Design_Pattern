package proxy;

public class Persuit implements IGiveGift {
	//实际上送礼物的是这个人。
	private String name;
	private Girl girl;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Persuit(Girl girl){
		this.girl=girl;
	} 

	@Override
	public void giveiphone() {
		System.out.println(this.name+"给"+this.girl.getName()+"送iphone");
	}

	@Override
	public void giveFlowers() {
		System.out.println(this.name+"给"+this.girl.getName()+"送花");
	}

	@Override
	public void giveChocolate() {
		System.out.println(this.name+"给"+this.girl.getName()+"巧克力");
	}

}

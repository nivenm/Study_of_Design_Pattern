package proxy;

public class Proxy implements IGiveGift {
	private Persuit persuit;
	

	public Proxy(Girl girl) {
		persuit = new Persuit(girl);
		//送礼物的人叫“杨二柱”
		persuit.setName("杨二柱");
		
	}

	@Override
	public void giveiphone() {
		persuit.giveiphone();
	}

	@Override
	public void giveFlowers() {
		persuit.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		persuit.giveChocolate();
	}

}

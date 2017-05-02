package proxy;

public class Proxy implements IGiveGift {
	private Persuit persuit;
	

	public Proxy(Girl girl) {
		persuit = new Persuit(girl);
		//��������˽С��������
		persuit.setName("�����");
		
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

package proxy;

public class Persuit implements IGiveGift {
	//ʵ�����������������ˡ�
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
		System.out.println(this.name+"��"+this.girl.getName()+"��iphone");
	}

	@Override
	public void giveFlowers() {
		System.out.println(this.name+"��"+this.girl.getName()+"�ͻ�");
	}

	@Override
	public void giveChocolate() {
		System.out.println(this.name+"��"+this.girl.getName()+"�ɿ���");
	}

}

package factory;

public class ExampleClient {

	public static void main(String[] args) {
		//工厂模式 相对于 简单工厂模式 ，需要在客户端中 判断该创建哪个实例，简单工厂模式直接在工厂类中给你判断好了
		//工厂模式这样做的目的在于，将原本的修改变成扩展，遵循了开放封闭原则(对扩展开放，对修改封闭)
		//然而在此例中将扩展的判断扔给客户端去解决，增加了客户端和逻辑类的耦合度。
		ILeiFengFactory factory = new UndergraduateFactory();
		ILeifeng undergraduate = factory.createLeiFeng();
		undergraduate.buyRice();
		undergraduate.sweep();
		undergraduate.wash();

	}

}

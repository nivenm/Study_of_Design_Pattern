package bridge;

public class ExampleClient {

	public static void main(String[] args) {
		AndroidBrand ab =null;
		//华为可以运行安卓的游戏
		ab = new HuaWeiMobilePhone(new Game());
		ab.dosth();
		//华为也可以运行安卓的通讯录
		ab= new HuaWeiMobilePhone(new Contact());
		ab.dosth();
		//小米可以运行安卓的游戏
		ab = new XiaoMiMobilePhone(new Game());
		ab.dosth();
		//小米也可以运行安卓的通讯录
		ab= new XiaoMiMobilePhone(new Contact());
		ab.dosth();
		
		
	}

}

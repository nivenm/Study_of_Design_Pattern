package bridge;

public class ExampleClient {

	public static void main(String[] args) {
		AndroidBrand ab =null;
		//��Ϊ�������а�׿����Ϸ
		ab = new HuaWeiMobilePhone(new Game());
		ab.dosth();
		//��ΪҲ�������а�׿��ͨѶ¼
		ab= new HuaWeiMobilePhone(new Contact());
		ab.dosth();
		//С�׿������а�׿����Ϸ
		ab = new XiaoMiMobilePhone(new Game());
		ab.dosth();
		//С��Ҳ�������а�׿��ͨѶ¼
		ab= new XiaoMiMobilePhone(new Contact());
		ab.dosth();
		
		
	}

}

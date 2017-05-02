package chain_of_responsibility;

public class ExampleClient {

	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("经理");
		MajordomoManager zongjian = new MajordomoManager("总监");
		GeneralManager zongjinli= new GeneralManager("总经理");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zongjinli);
		
		Request qingjia1tian = new Request();
		qingjia1tian.setRequestType("请假");
		qingjia1tian.setRequestContent("小菜请假");
		qingjia1tian.setRequestNumber(1);
		jinli.RequestApplications(qingjia1tian);
		
		Request qingjia4tian = new Request();
		qingjia4tian.setRequestType("请假");
		qingjia4tian.setRequestContent("小菜请假");
		qingjia4tian.setRequestNumber(4);
		jinli.RequestApplications(qingjia4tian);
		
		Request jiaxin500 = new Request();
		jiaxin500.setRequestType("加薪");
		jiaxin500.setRequestContent("小菜加薪");
		jiaxin500.setRequestNumber(500);
		jinli.RequestApplications(jiaxin500);
		
		
		Request jiaxin1000 = new Request();
		jiaxin1000.setRequestType("加薪");
		jiaxin1000.setRequestContent("小菜加薪");
		jiaxin1000.setRequestNumber(1000);
		jinli.RequestApplications(jiaxin1000);
		
		
	}

}

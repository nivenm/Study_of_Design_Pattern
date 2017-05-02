package chain_of_responsibility;

public class ExampleClient {

	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("����");
		MajordomoManager zongjian = new MajordomoManager("�ܼ�");
		GeneralManager zongjinli= new GeneralManager("�ܾ���");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zongjinli);
		
		Request qingjia1tian = new Request();
		qingjia1tian.setRequestType("���");
		qingjia1tian.setRequestContent("С�����");
		qingjia1tian.setRequestNumber(1);
		jinli.RequestApplications(qingjia1tian);
		
		Request qingjia4tian = new Request();
		qingjia4tian.setRequestType("���");
		qingjia4tian.setRequestContent("С�����");
		qingjia4tian.setRequestNumber(4);
		jinli.RequestApplications(qingjia4tian);
		
		Request jiaxin500 = new Request();
		jiaxin500.setRequestType("��н");
		jiaxin500.setRequestContent("С�˼�н");
		jiaxin500.setRequestNumber(500);
		jinli.RequestApplications(jiaxin500);
		
		
		Request jiaxin1000 = new Request();
		jiaxin1000.setRequestType("��н");
		jiaxin1000.setRequestContent("С�˼�н");
		jiaxin1000.setRequestNumber(1000);
		jinli.RequestApplications(jiaxin1000);
		
		
	}

}

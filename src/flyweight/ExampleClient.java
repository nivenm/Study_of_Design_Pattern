package flyweight;



public class ExampleClient {
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategroy("��Ʒչʾ");
		fx.Use(new User("С��"));
		WebSite fy = f.getWebSiteCategroy("��Ʒչʾ");
		fy.Use(new User("����"));
		WebSite fz = f.getWebSiteCategroy("��Ʒչʾ");
		fz.Use(new User("����"));
		WebSite fl = f.getWebSiteCategroy("����");
		fl.Use(new User("����ͯ"));
		WebSite fm = f.getWebSiteCategroy("����");
		fm.Use(new User("�ҹ�����"));
		WebSite fn = f.getWebSiteCategroy("����");
		fn.Use(new User("�Ϻ�����"));
		System.out.println("�õ���վ�ķ�������Ϊ"+f.WebSiteCount()+"��");
	}

}

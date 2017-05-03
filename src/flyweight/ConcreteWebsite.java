package flyweight;
/**
 * ������վ��
 * @author WangTianHai
 *
 */
public class ConcreteWebsite extends WebSite {
	private String webSiteClassName;

	public ConcreteWebsite(String webSiteClassName) {
		this.webSiteClassName = webSiteClassName;
	}
//�����û��Ĳ�ͬչ�ֲ�ͬ������
	@Override
	public void Use(User user) {
		System.out.println("��վ���ࣺ"+webSiteClassName+"\t"+"�û���"+user.getName());
	}

}

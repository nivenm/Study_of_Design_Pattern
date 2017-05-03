package flyweight;
/**
 * 具体网站类
 * @author WangTianHai
 *
 */
public class ConcreteWebsite extends WebSite {
	private String webSiteClassName;

	public ConcreteWebsite(String webSiteClassName) {
		this.webSiteClassName = webSiteClassName;
	}
//根据用户的不同展现不同的内容
	@Override
	public void Use(User user) {
		System.out.println("网站分类："+webSiteClassName+"\t"+"用户："+user.getName());
	}

}

package flyweight;

import java.util.HashMap;
/**
 * 网站工厂 管理所有网站类的示例
 * @author WangTianHai
 *
 */
public class WebSiteFactory {
	private HashMap<String,WebSite> flyweights = new HashMap<String,WebSite>();
	public WebSite getWebSiteCategroy(String Key){
		if(!flyweights.containsKey(Key)){
			flyweights.put(Key, new ConcreteWebsite(Key));
		}
		return flyweights.get(Key);
		
	}
	
	public int WebSiteCount(){
		return flyweights.size();
	}

}

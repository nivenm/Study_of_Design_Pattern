package flyweight;



public class ExampleClient {
	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		WebSite fx = f.getWebSiteCategroy("产品展示");
		fx.Use(new User("小菜"));
		WebSite fy = f.getWebSiteCategroy("产品展示");
		fy.Use(new User("大鸟"));
		WebSite fz = f.getWebSiteCategroy("产品展示");
		fz.Use(new User("娇娇"));
		WebSite fl = f.getWebSiteCategroy("博客");
		fl.Use(new User("老顽童"));
		WebSite fm = f.getWebSiteCategroy("博客");
		fm.Use(new User("桃谷六仙"));
		WebSite fn = f.getWebSiteCategroy("博客");
		fn.Use(new User("南海鳄神"));
		System.out.println("得倒网站的分类总数为"+f.WebSiteCount()+"个");
	}

}

package adapter;
/**
 * 中国来的中锋听不懂英语
 * 只知道拼音的进攻和防守
 * @author wangth89
 *
 */
public class ChineseCenter {
	protected String name;

	public ChineseCenter(String name) {
		this.name=name;
	}
	//进攻
	public void JingGong(){
		System.out.println("中锋:" + this.name + "进攻");
	}
	//防守
	public void Fangshou(){
		System.out.println("中锋:" + this.name + "防守");
	}

}

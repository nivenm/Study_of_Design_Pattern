package flyweight;
/**
 * 用户类 是整个网站类的外部状态，<br>所有不同的展现是根据这个状态的不同来改变的
 * @author WangTianHai
 *
 */
public class User {
	private String Name;
	public User(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

}

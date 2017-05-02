package adapter;
/**
 * 火箭队队员模板类 都有进攻和防守的方法
 * @author wangth89
 *
 */
public abstract class Player {
	protected String name;
	public Player(String name){
		this.name=name;
	}
	public abstract void attack();
	public abstract void defense();
}

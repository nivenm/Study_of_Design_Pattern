package memento;
/**
 * 备忘管理类
 * 在这个例子中貌似没什么用，因为这个例子中只有一个进度
 * 但是你考虑一下实际上很少有游戏中只提供一个进度的保存读取，可以保存多个进度比如 今天的进度， 昨天的进度 ，上个月的进度 ，20年前的进度
 * 这个类可以实现对这些进度的管理
 * 
 * @author wangth89
 *
 */
public class RoleStateCaretaker {
	private RoleMemento roleMemento;

	public RoleMemento getRoleMemento() {
		return roleMemento;
	}

	public void setRoleMemento(RoleMemento roleMemento) {
		this.roleMemento = roleMemento;
	}
}

package memento;
/**
 * ����������
 * �����������ò��ûʲô�ã���Ϊ���������ֻ��һ������
 * �����㿼��һ��ʵ���Ϻ�������Ϸ��ֻ�ṩһ�����ȵı����ȡ�����Ա��������ȱ��� ����Ľ��ȣ� ����Ľ��� ���ϸ��µĽ��� ��20��ǰ�Ľ���
 * ��������ʵ�ֶ���Щ���ȵĹ���
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

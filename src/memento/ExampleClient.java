package memento;

public class ExampleClient {

	public static void main(String[] args) {
		//��սBoss֮ǰ��ʼ����ɫ
		System.out.println("-----------------��սBoss֮ǰ��ʼ����ɫ------------------");
		GameRole lixiaoyao = new GameRole("����ң");
		lixiaoyao.initSate();
		lixiaoyao.display();
		//�Է���������ȱ���һ�½���
		System.out.println("-----------------�Է���������ȱ���һ�½���------------------");
		RoleStateCaretaker taker = new RoleStateCaretaker();
		taker.setRoleMemento(lixiaoyao.saveState());
		System.out.println("-----------------������Ͽ�ʼ��BOSS------------------");
		//��Ȼû������BOSS
		System.out.println("-----------------��Ȼû������BOSS------------------");
		lixiaoyao.defeated();
		lixiaoyao.display();
		System.out.println("-----------------�����¶�ȡ������Ȼظ�����Ѫ״̬����------------------");
		lixiaoyao.recoveryState(taker.getRoleMemento());
		lixiaoyao.display();
	}

}

package memento;

public class ExampleClient {

	public static void main(String[] args) {
		//大战Boss之前初始化角色
		System.out.println("-----------------大战Boss之前初始化角色------------------");
		GameRole lixiaoyao = new GameRole("李逍遥");
		lixiaoyao.initSate();
		lixiaoyao.display();
		//以防输掉所以先保存一下进度
		System.out.println("-----------------以防输掉所以先保存一下进度------------------");
		RoleStateCaretaker taker = new RoleStateCaretaker();
		taker.setRoleMemento(lixiaoyao.saveState());
		System.out.println("-----------------保存完毕开始打BOSS------------------");
		//果然没打过这个BOSS
		System.out.println("-----------------果然没打过这个BOSS------------------");
		lixiaoyao.defeated();
		lixiaoyao.display();
		System.out.println("-----------------果重新读取这个进度回复到满血状态再来------------------");
		lixiaoyao.recoveryState(taker.getRoleMemento());
		lixiaoyao.display();
	}

}

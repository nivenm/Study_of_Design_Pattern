package command;

public class ExampleClient {

	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand3 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand4 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand5 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand6 = new BakeMuttonCommand(boy);
		Command bakeChickenWingsCommand = new BakeChickenWings(boy);
		
		Waiter girl = new Waiter();
		//�㿾����
		girl.setOrders(bakeChickenWingsCommand);
		//�����⴮
		girl.setOrders(bakeMuttonCommand1);
		girl.setOrders(bakeMuttonCommand2);
		girl.setOrders(bakeMuttonCommand3);
		girl.setOrders(bakeMuttonCommand4);
		girl.setOrders(bakeMuttonCommand5);
		girl.setOrders(bakeMuttonCommand6);
		//���������̫���˼�ȥһ���ɣ��崮����~~
		girl.cancelOrders(bakeMuttonCommand6);
		//֪ͨ�տ�ʦ������
		girl.notifyAllCommand();
		
		
	}

}

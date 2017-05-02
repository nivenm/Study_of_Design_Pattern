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
		//点烤鸡翅
		girl.setOrders(bakeChickenWingsCommand);
		//点羊肉串
		girl.setOrders(bakeMuttonCommand1);
		girl.setOrders(bakeMuttonCommand2);
		girl.setOrders(bakeMuttonCommand3);
		girl.setOrders(bakeMuttonCommand4);
		girl.setOrders(bakeMuttonCommand5);
		girl.setOrders(bakeMuttonCommand6);
		//额。。。六串太多了减去一串吧，五串够了~~
		girl.cancelOrders(bakeMuttonCommand6);
		//通知烧烤师傅开烤
		girl.notifyAllCommand();
		
		
	}

}

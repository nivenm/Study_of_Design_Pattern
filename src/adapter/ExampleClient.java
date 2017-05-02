package adapter;

public class ExampleClient {

	public static void main(String[] args) {
		//美国球员
		Player b = new Forward("巴蒂尔");
		Player m = new Guard("麦克格雷迪");
		//美国球员执行进攻任务
		b.attack();
		m.attack();
		//中国球员
		//由于姚明刚到美国听不懂英文，所以他需要翻译，这边的这个翻译就相当于适配器模式中的适配器类
		Player ym = new Translator("姚明");
		//中国球员执行进攻任务
		ym.attack();
		
		//美国球员执行防守任务
		b.defense();
		m.defense();
		
		//中国球员执行防守任务
		ym.defense();
	}

}

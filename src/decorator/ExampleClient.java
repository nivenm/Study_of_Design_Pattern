package decorator;
/**
 * 即将毕业的小明忙碌的一天
 * @author wangth89
 *
 */
public class ExampleClient {

	public static void main(String[] args) {
		/*
		 * 场景一:小明早起正在洗澡
		 */
		System.out.println("-------------------小明早起正在洗澡--------------------");
		Apparel XiaoMing = new Person("小明");
		//小明什么也没穿
		XiaoMing.show();
		System.out.println("*******************解释:小明什么也没穿******************\n\n");
		
		/*
		 * 场景二:小明早上要去某公司面试
		 */
		System.out.println("-------------------早上要去某公司面试--------------------");
		SuitDecorator suit= new SuitDecorator(XiaoMing);
		LeatherShowesDecorator LeatherShowes= new LeatherShowesDecorator(suit);
		LeatherShowes.show();
		System.out.println("*******************解释:小明穿了西装皮鞋******************\n\n");
		
		/*
		 * 场景三:小明面试结束约了朋友一起打球
		 */
		System.out.println("-------------------面试结束约了朋友一起打球----------------");
		SportsSuitDecorator SportsSuit = new SportsSuitDecorator(XiaoMing);
		SneakersDecorator sneaker = new SneakersDecorator(SportsSuit);
		sneaker.show();
		System.out.println("*******************解释:小明穿了运动套装去打球******************\n\n");
		
		/*
		 *场景四:打完球回家小明随便穿了一些宽松的衣服 
		 */
		System.out.println("-------------------打完球回家小明随便穿了一些宽松的衣服 ----------------");
		TshirtsDecorator TShirt = new TshirtsDecorator(XiaoMing);
		BigTrouserDecorator bt = new BigTrouserDecorator(TShirt);
		bt.show();
		System.out.println("*******************解释:在家比较随意，小明穿了T恤和垮裤******************\n\n");
		
	}

}

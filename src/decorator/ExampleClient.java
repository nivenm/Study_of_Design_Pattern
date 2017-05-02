package decorator;
/**
 * ������ҵ��С��æµ��һ��
 * @author wangth89
 *
 */
public class ExampleClient {

	public static void main(String[] args) {
		/*
		 * ����һ:С����������ϴ��
		 */
		System.out.println("-------------------С����������ϴ��--------------------");
		Apparel XiaoMing = new Person("С��");
		//С��ʲôҲû��
		XiaoMing.show();
		System.out.println("*******************����:С��ʲôҲû��******************\n\n");
		
		/*
		 * ������:С������Ҫȥĳ��˾����
		 */
		System.out.println("-------------------����Ҫȥĳ��˾����--------------------");
		SuitDecorator suit= new SuitDecorator(XiaoMing);
		LeatherShowesDecorator LeatherShowes= new LeatherShowesDecorator(suit);
		LeatherShowes.show();
		System.out.println("*******************����:С��������װƤЬ******************\n\n");
		
		/*
		 * ������:С�����Խ���Լ������һ�����
		 */
		System.out.println("-------------------���Խ���Լ������һ�����----------------");
		SportsSuitDecorator SportsSuit = new SportsSuitDecorator(XiaoMing);
		SneakersDecorator sneaker = new SneakersDecorator(SportsSuit);
		sneaker.show();
		System.out.println("*******************����:С�������˶���װȥ����******************\n\n");
		
		/*
		 *������:������ؼ�С����㴩��һЩ���ɵ��·� 
		 */
		System.out.println("-------------------������ؼ�С����㴩��һЩ���ɵ��·� ----------------");
		TshirtsDecorator TShirt = new TshirtsDecorator(XiaoMing);
		BigTrouserDecorator bt = new BigTrouserDecorator(TShirt);
		bt.show();
		System.out.println("*******************����:�ڼұȽ����⣬С������T���Ϳ��******************\n\n");
		
	}

}

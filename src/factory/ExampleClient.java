package factory;

public class ExampleClient {

	public static void main(String[] args) {
		//����ģʽ ����� �򵥹���ģʽ ����Ҫ�ڿͻ����� �жϸô����ĸ�ʵ�����򵥹���ģʽֱ���ڹ������и����жϺ���
		//����ģʽ��������Ŀ�����ڣ���ԭ�����޸ı����չ����ѭ�˿��ŷ��ԭ��(����չ���ţ����޸ķ��)
		//Ȼ���ڴ����н���չ���ж��Ӹ��ͻ���ȥ����������˿ͻ��˺��߼������϶ȡ�
		ILeiFengFactory factory = new UndergraduateFactory();
		ILeifeng undergraduate = factory.createLeiFeng();
		undergraduate.buyRice();
		undergraduate.sweep();
		undergraduate.wash();

	}

}

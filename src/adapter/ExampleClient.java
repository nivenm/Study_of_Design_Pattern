package adapter;

public class ExampleClient {

	public static void main(String[] args) {
		//������Ա
		Player b = new Forward("�͵ٶ�");
		Player m = new Guard("��˸��׵�");
		//������Աִ�н�������
		b.attack();
		m.attack();
		//�й���Ա
		//����Ҧ���յ�����������Ӣ�ģ���������Ҫ���룬��ߵ����������൱��������ģʽ�е���������
		Player ym = new Translator("Ҧ��");
		//�й���Աִ�н�������
		ym.attack();
		
		//������Աִ�з�������
		b.defense();
		m.defense();
		
		//�й���Աִ�з�������
		ym.defense();
	}

}

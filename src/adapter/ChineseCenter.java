package adapter;
/**
 * �й������з�������Ӣ��
 * ֻ֪��ƴ���Ľ����ͷ���
 * @author wangth89
 *
 */
public class ChineseCenter {
	protected String name;

	public ChineseCenter(String name) {
		this.name=name;
	}
	//����
	public void JingGong(){
		System.out.println("�з�:" + this.name + "����");
	}
	//����
	public void Fangshou(){
		System.out.println("�з�:" + this.name + "����");
	}

}

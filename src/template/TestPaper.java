package template;
/**
 * ��ͨ���������� �Ծ�~~~
 * @author wangth89
 *
 */
public abstract class TestPaper {
	public void askQuestion1() {
		System.out.println("��С������̨��������ʺ��ȥ��һ�º�ô���� ���Ҳ����Ҳ���������\n�ʣ�С����������̨��");
		System.out.println("��" + answerQuestion1());
	}

	public void askQuestion2() {
		System.out.println("��С������������˼�޿��أ���ȥ��ȥ��������ȥ�������в���������\n�ʣ�С��ȥ��ȥ˼�޿Σ�");
		System.out.println("��" + answerQuestion2());
	}

	public void askQuestion3() {
		System.out.println("��С�����������ô����������ˡ���������˵��������˵��������˵������˵�ɡ���\n�ʣ�˭��˵��");
		System.out.println("��" + answerQuestion3());
	}

	public void askQuestion4() {
		System.out.println("��С�������������������ң�Ҫ��Ҫ����һ��ȥ�����������������ð�����������\n�ʣ�С������Ҫ��Ҫȥ���˼����ã�");
		System.out.println("��" + answerQuestion4());
	}

	public abstract String answerQuestion1();

	public abstract String answerQuestion2();

	public abstract String answerQuestion3();

	public abstract String answerQuestion4();
}

package adapter;
/**
 * �����й���Ա�յ���������������Ӣ�������Ҫ����
 * ���������attack����Ҫ���������� defense����Ҫ����������
 * ������ߵ����������൱��������ģʽ�е���������
 * @author wangth89
 *
 */
public class Translator extends Player {
   ChineseCenter chineseCenter;
	public Translator(String name) {
		super(name);
		chineseCenter = new ChineseCenter(this.name);
	}

	@Override
	public void attack() {
		chineseCenter.JingGong();
	}

	@Override
	public void defense() {
		chineseCenter.Fangshou();
	}

}

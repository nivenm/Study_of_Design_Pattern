package chain_of_responsibility;
/**
 * ������Ա��
 * �൱��ְ����ģʽ�еĳ���Handler��
 * ������ְ����ĳ�������߽ӿ�
 * @author wangth89
 *
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;
    public Manager(String name) {
		this.name = name;
	}
    //�����ϼ�ְ����
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
    //���������࣬��Ҫ��ʵ��
   public abstract void RequestApplications(Request request);
    
}

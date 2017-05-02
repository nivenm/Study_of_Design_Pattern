package strategy;
/**
 * ���������˲���ģʽ �͹���ģʽ�Ľ��
 * ���������������ģʽ��ã����� ���ǻ��ÿͻ�������������Ĳ���ʵ����
 * �빤��ģʽ��Ͼͱ����˸�����
 * @author wangth89
 *
 */
public class ChargeContextFactory {
	private ICharge charge;

	public ChargeContextFactory(String type) {
		switch(type){
		case "�����շ�":
			this.charge=new NormalCharge();
			break;
		case "ÿ��300��100":
			this.charge=new ChargeRetun(300,100);
			break;
		case "��8��":
			this.charge = new ChargeRebate(0.8);
			break;
		}
	}
	
	public double getFianalFee(double money){
		return this.charge.getFianalFee(money);
	}

}

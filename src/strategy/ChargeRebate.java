package strategy;
/**
 * ���۵�ʱ����������շ�
 * @author wangth89
 *
 */
public class ChargeRebate implements ICharge {
	private double rebate;
/**
 * 
 * @param rebate �ۿ�
 */
	public ChargeRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double getFianalFee(double money) {
		double finalmoney = money * rebate;
		return finalmoney;
	}

}

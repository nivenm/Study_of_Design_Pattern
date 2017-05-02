package strategy;
/**
 * 打折的时候计算最终收费
 * @author wangth89
 *
 */
public class ChargeRebate implements ICharge {
	private double rebate;
/**
 * 
 * @param rebate 折扣
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

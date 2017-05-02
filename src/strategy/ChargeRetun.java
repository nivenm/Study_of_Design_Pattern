package strategy;
/**
 * 每满多少减多少的优惠模式
 * @author wangth89
 *
 */
public class ChargeRetun implements ICharge {
private double chargeCondition;
private double chargeReturn;
/**
 * 
 * @param chargeCondition 每满多少
 * @param chargeReturn 减多少
 */
	public ChargeRetun(double chargeCondition, double chargeReturn) {
	this.chargeCondition = chargeCondition;
	this.chargeReturn = chargeReturn;
}
	@Override
	public double getFianalFee(double money) {
		double finaleCharge=money;
		if(money>=chargeCondition){
			finaleCharge=money-Math.floor(money/chargeCondition)*chargeReturn;
		}
		return finaleCharge;
	}

}

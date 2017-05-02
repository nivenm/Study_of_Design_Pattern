package strategy;
/**
 * ÿ�����ټ����ٵ��Ż�ģʽ
 * @author wangth89
 *
 */
public class ChargeRetun implements ICharge {
private double chargeCondition;
private double chargeReturn;
/**
 * 
 * @param chargeCondition ÿ������
 * @param chargeReturn ������
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

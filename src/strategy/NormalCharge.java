package strategy;
/**
 * �����շ�
 * @author wangth89
 *
 */
public class NormalCharge implements ICharge {

	@Override
	public double getFianalFee(double money) {
		
		return money;
	}

}

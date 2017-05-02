package strategy;
/**
 * 策略模式 【以商场按照不同的优惠方式来计算最终价格】的场景为例
 * @author wangth89
 *
 */
public interface ICharge {
	/**
	 * 计算最终价格
	 * @return
	 */
public double getFianalFee(double money);
}

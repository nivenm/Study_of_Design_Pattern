package strategy;
/**
 * Context¿‡
 * @author wangth89
 *
 */
public class ChargeContext {
	private ICharge charge;

	public ChargeContext(ICharge charge) {
		this.charge = charge;
	}
	
	public double getFianalFee(double money){
		return this.charge.getFianalFee(money);
	}

}

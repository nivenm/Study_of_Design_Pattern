package strategy;
/**
 * 此类掩饰了策略模式 和工厂模式的结合
 * 问题的由来：策略模式虽好，但是 还是会让客户端来依赖具体的策略实现类
 * 与工厂模式结合就避免了该问题
 * @author wangth89
 *
 */
public class ChargeContextFactory {
	private ICharge charge;

	public ChargeContextFactory(String type) {
//		switch(type){
//		case "正常收费":
//			this.charge=new NormalCharge();
//			break;
//		case "每满300减100":
//			this.charge=new ChargeRetun(300,100);
//			break;
//		case "打8折":
//			this.charge = new ChargeRebate(0.8);
//			break;
//		}
		if("正常收费".equals(type)){
			this.charge=new NormalCharge();
		}else if("每满300减100".equals(type)){
			this.charge=new ChargeRetun(300,100);
		}else if("打8折".equals(type)){
			this.charge = new ChargeRebate(0.8);
		}
	}
	
	public double getFianalFee(double money){
		return this.charge.getFianalFee(money);
	}

}

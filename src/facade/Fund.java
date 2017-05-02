package facade;
/**
 * 这边这个组合基金类 就担任外观设计模式中的Facade类
 * 客户只需要操作这个基金来进行投资，而并不需要知晓这个基金到底买了哪些股票或者债券产品。
 * 基金负责组合投资这个具体的理财产品。
 * @author wangth89
 *
 */
public class Fund implements IFinancialProductsOperator {

	Stock1 zsy = new Stock1();
	Stock2 zsh = new Stock2();
	NationalDept guozhai =new NationalDept(); 
	@Override
	public void Sell() {
		zsy.Sell();
		zsh.Sell();
		guozhai.Sell();
	}

	@Override
	public void Buy() {
		zsy.Buy();
		zsh.Buy();
		guozhai.Buy();
	}

}

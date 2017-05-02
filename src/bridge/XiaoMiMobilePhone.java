package bridge;
/**
 * 正在运行某程序的小米手机
 * @author wangth89
 *
 */
public class XiaoMiMobilePhone extends AndroidBrand {

	public XiaoMiMobilePhone(AndroidSoftWare androidSoft) {
		super(androidSoft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dosth() {
		super.androidSoft.run();
	}

}

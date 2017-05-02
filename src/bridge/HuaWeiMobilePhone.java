package bridge;
/**
 * 表示正在运行某程序的华为手机
 * @author wangth89
 *
 */
public class HuaWeiMobilePhone extends AndroidBrand {

	public HuaWeiMobilePhone(AndroidSoftWare androidSoft) {
		super(androidSoft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dosth() {
		super.androidSoft.run();
	}

}

package bridge;
/**
 * ��������ĳ�����С���ֻ�
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

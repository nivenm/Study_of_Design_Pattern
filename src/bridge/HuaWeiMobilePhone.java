package bridge;
/**
 * ��ʾ��������ĳ����Ļ�Ϊ�ֻ�
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

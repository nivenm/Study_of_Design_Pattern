package bridge;
/**
 * ��׿�ֻ��ĳ�����
 * ��ʾ����������ĳ����İ�׿�ֻ�
 * @author wangth89
 *
 */
public abstract class AndroidBrand {
	protected AndroidSoftWare androidSoft;
	public AndroidBrand(AndroidSoftWare androidSoft) {
		this.androidSoft = androidSoft;
	}
	public abstract void dosth();

}

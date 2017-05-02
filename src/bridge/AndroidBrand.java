package bridge;
/**
 * 安卓手机的抽象父类
 * 表示该正在运行某程序的安卓手机
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

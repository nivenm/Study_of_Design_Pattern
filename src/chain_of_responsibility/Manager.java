package chain_of_responsibility;
/**
 * 管理人员类
 * 相当于职责链模式中的抽象Handler类
 * 是所有职责类的抽象类或者接口
 * @author wangth89
 *
 */
public abstract class Manager {
    protected String name;
    protected Manager superior;
    public Manager(String name) {
		this.name = name;
	}
    //设置上级职责类
	public void setSuperior(Manager superior) {
		this.superior = superior;
	}
    //处理请求类，需要被实现
   public abstract void RequestApplications(Request request);
    
}

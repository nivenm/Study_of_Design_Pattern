package chain_of_responsibility;
/**
 * 相当于职责链模式中的一般请求处理的实现类
 * @author wangth89
 *
 */
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}
	//如果无权处理某一职责则交给上级去处理
	@Override
	public void RequestApplications(Request request) {
		if("请假".equals(request.getRequestType()) && request.getRequestNumber()<=2){
			System.out.println(name+":"+"请假"+request.getRequestNumber()+"天，被批准");
		}else{
			if(this.superior!=null){
				this.superior.RequestApplications(request);
			}
		}
	}

}

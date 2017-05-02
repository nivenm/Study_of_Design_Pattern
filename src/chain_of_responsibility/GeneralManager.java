package chain_of_responsibility;
/**
 * 相当于职责链模式中的一般请求处理的实现类
 * @author wangth89
 *
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}
//如果无权处理某一职责则交给上级去处理
	@Override
	public void RequestApplications(Request request) {
		if("请假".equals(request.getRequestType())){
			System.out.println(name+":"+"请假"+request.getRequestNumber()+"天，被批准");
		}else if("加薪".equals(request.getRequestType()) && request.getRequestNumber()<=500){
			System.out.println(name+":"+"加薪"+request.getRequestNumber()+"元，被批准");
		}else if("加薪".equals(request.getRequestType()) && request.getRequestNumber()>500){
			System.out.println(name+":"+"再说吧");
		}
	}

}

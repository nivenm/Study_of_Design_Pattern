package chain_of_responsibility;
/**
 * �൱��ְ����ģʽ�е�һ���������ʵ����
 * @author wangth89
 *
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}
//�����Ȩ����ĳһְ���򽻸��ϼ�ȥ����
	@Override
	public void RequestApplications(Request request) {
		if("���".equals(request.getRequestType())){
			System.out.println(name+":"+"���"+request.getRequestNumber()+"�죬����׼");
		}else if("��н".equals(request.getRequestType()) && request.getRequestNumber()<=500){
			System.out.println(name+":"+"��н"+request.getRequestNumber()+"Ԫ������׼");
		}else if("��н".equals(request.getRequestType()) && request.getRequestNumber()>500){
			System.out.println(name+":"+"��˵��");
		}
	}

}

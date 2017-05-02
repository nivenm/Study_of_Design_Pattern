package chain_of_responsibility;
/**
 * �൱��ְ����ģʽ�е�һ���������ʵ����
 * @author wangth89
 *
 */
public class MajordomoManager extends Manager {

	public MajordomoManager(String name) {
		super(name);
	}
	//�����Ȩ����ĳһְ���򽻸��ϼ�ȥ����
	@Override
	public void RequestApplications(Request request) {
		if("���".equals(request.getRequestType()) && request.getRequestNumber()<=5){
			System.out.println(name+":"+"���"+request.getRequestNumber()+"�죬����׼");
		}else{
			if(this.superior!=null){
				this.superior.RequestApplications(request);
			}
		}
	}

}

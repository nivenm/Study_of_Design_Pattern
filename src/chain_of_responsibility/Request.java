package chain_of_responsibility;
/**
 * ������ �����������
 * @author wangth89
 *
 */
public class Request {
	private String requestType;
	private String RequestContent;
	private int RequestNumber;
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestContent() {
		return RequestContent;
	}
	public void setRequestContent(String requestContent) {
		RequestContent = requestContent;
	}
	public int getRequestNumber() {
		return RequestNumber;
	}
	public void setRequestNumber(int requestNumber) {
		RequestNumber = requestNumber;
	}

}

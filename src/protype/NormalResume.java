package protype;
/**
 * �������͵Ŀ�¡
 * �������͵Ŀ�¡ ֱ���ǰ�λ����
 * @author wangth89
 *
 */
public class NormalResume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private String timearea;
	private String company;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getTimearea() {
		return timearea;
	}

	public void setTimearea(String timearea) {
		this.timearea = timearea;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Object Clone() {
		NormalResume resume = new NormalResume();
		//�������͵Ŀ�¡ ֱ���ǰ�λ����
		resume.setName(this.name);
		resume.setSex(this.sex);
		resume.setAge(this.age);
		resume.setTimearea(this.timearea);
		resume.setCompany(this.company);
		return resume;

	}
	public void Display(){
		System.out.println("������"+this.name);
		System.out.println("�Ա�"+this.sex);
		System.out.println("���䣺"+this.age);
		System.out.print("ʱ��Σ�"+this.timearea+"\t");
		System.out.println("��˾��"+this.company);
	}
}

package protype;
/**
 * ��ʼ������
 * @author wangth89
 *
 */
public class ShallowCopyResume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private ShallowWorkExperience workExperience;

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

	public ShallowWorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(ShallowWorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public Object Clone() {
		ShallowCopyResume resume = new ShallowCopyResume();
		resume.setName(this.name);
		resume.setSex(this.sex);
		resume.setAge(this.age);
		//ע������ʵ����ֻ������ Ҳ����ֻ�ǰѵ�ַָ��new������resume���е�workExperience����
		resume.setWorkExperience(this.workExperience);;
		return resume;

	}
	
	public void Display(){
		System.out.println("������"+this.name);
		System.out.println("�Ա�"+this.sex);
		System.out.println("���䣺"+this.age);
		System.out.print("ʱ��Σ�"+this.getWorkExperience().getWorkdate()+"\t");
		System.out.println("��˾��"+this.getWorkExperience().getCompany());
	}

}

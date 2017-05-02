package protype;
/**
 * ��ʼ������
 * @author wangth89
 *
 */
public class DeepCopyResume implements Cloneable {
	private String name;
	private String sex;
	private String age;
	private DeepWorkExperience workExperience;

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

	public DeepWorkExperience getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(DeepWorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	public Object Clone() {
		DeepCopyResume resume = new DeepCopyResume();
		resume.setName(this.name);
		resume.setSex(this.sex);
		resume.setAge(this.age);
		//ע�����︴�Ƶ�ʱ���ͨ�����ͱ���Ŀ�¡����������һ���µ�ʵ��������
		resume.setWorkExperience((DeepWorkExperience)workExperience.Clone());
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

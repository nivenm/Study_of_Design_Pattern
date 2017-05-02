package protype;
/**
 * 初始简历类
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
		//注意这里复制的时候就通过类型本身的克隆方法返回了一个新的实例给它。
		resume.setWorkExperience((DeepWorkExperience)workExperience.Clone());
		return resume;

	}
	
	public void Display(){
		System.out.println("姓名："+this.name);
		System.out.println("性别："+this.sex);
		System.out.println("年龄："+this.age);
		System.out.print("时间段："+this.getWorkExperience().getWorkdate()+"\t");
		System.out.println("公司："+this.getWorkExperience().getCompany());
	}

}

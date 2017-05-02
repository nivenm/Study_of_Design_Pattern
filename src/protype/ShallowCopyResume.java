package protype;
/**
 * 初始简历类
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
		//注意这里实际上只是引用 也就是只是把地址指向new出来的resume类中的workExperience变量
		resume.setWorkExperience(this.workExperience);;
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

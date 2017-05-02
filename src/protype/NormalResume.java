package protype;
/**
 * 基本类型的克隆
 * 基本类型的克隆 直接是按位复制
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
		//基本类型的克隆 直接是按位复制
		resume.setName(this.name);
		resume.setSex(this.sex);
		resume.setAge(this.age);
		resume.setTimearea(this.timearea);
		resume.setCompany(this.company);
		return resume;

	}
	public void Display(){
		System.out.println("姓名："+this.name);
		System.out.println("性别："+this.sex);
		System.out.println("年龄："+this.age);
		System.out.print("时间段："+this.timearea+"\t");
		System.out.println("公司："+this.company);
	}
}

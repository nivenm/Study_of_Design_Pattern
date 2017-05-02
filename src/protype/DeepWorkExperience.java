package protype;

public class DeepWorkExperience implements Cloneable {
 private String workdate;
 private String company;
public String getWorkdate() {
	return workdate;
}
public void setWorkdate(String workdate) {
	this.workdate = workdate;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}

public Object Clone() {
	DeepWorkExperience workExperience = new DeepWorkExperience();
	workExperience.setWorkdate(workdate);
	workExperience.setCompany(company);
	return workExperience;

}
}

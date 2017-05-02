package protype;

public class ExampleClient {

	public static void main(String[] args) {
		//---------------基本类型的克隆-----------------------
		System.out.println("---------------基本类型的克隆-----------------------");
		NormalResume normalResume1 = new NormalResume();
		normalResume1.setName("大卫。贝克汉姆");
		normalResume1.setAge("42");
		normalResume1.setSex("男");
		normalResume1.setTimearea("1992年-2003年");
		normalResume1.setCompany("曼彻斯特联队");
		
		NormalResume normalResume2=(NormalResume) normalResume1.Clone();
		normalResume2.setTimearea("2003年-2007年");
		normalResume2.setCompany("皇家马德里");
		
		NormalResume normalResume3=(NormalResume) normalResume1.Clone();
		normalResume3.setTimearea("2007年-2012年");
		normalResume3.setCompany("洛杉矶银河");
		
		NormalResume normalResume4=(NormalResume) normalResume1.Clone();
		normalResume4.setTimearea("2012年-2013年");
		normalResume4.setCompany("巴黎圣日耳曼");
		
		normalResume1.Display();
		normalResume2.Display();
		normalResume3.Display();
		normalResume4.Display();
		
		//---------------浅克隆-----------------------
		System.out.println("---------------浅克隆-----------------------");
		ShallowCopyResume shallowResume1 = new ShallowCopyResume();
		ShallowWorkExperience shallowWorkEp = new ShallowWorkExperience();
		shallowResume1.setName("大卫。贝克汉姆");
		shallowResume1.setAge("42");
		shallowResume1.setSex("男");
		
		shallowWorkEp.setWorkdate("1992年-2003年");
		shallowWorkEp.setCompany("曼彻斯特联队");
		shallowResume1.setWorkExperience(shallowWorkEp);
		
		ShallowCopyResume shallowResume2 = (ShallowCopyResume)shallowResume1.Clone();
		shallowResume2.getWorkExperience().setWorkdate("2003年-2007年");
		shallowResume2.getWorkExperience().setCompany("皇家马德里");
		
		ShallowCopyResume shallowResume3=(ShallowCopyResume)shallowResume1.Clone();
		shallowResume3.getWorkExperience().setWorkdate("2007年-2012年");
		shallowResume3.getWorkExperience().setCompany("洛杉矶银河");
		
		ShallowCopyResume shallowResume4=(ShallowCopyResume)shallowResume1.Clone();
		shallowResume4.getWorkExperience().setWorkdate("2012年-2013年");
		shallowResume4.getWorkExperience().setCompany("巴黎圣日耳曼");
		
		shallowResume1.Display();
		shallowResume2.Display();
		shallowResume3.Display();
		shallowResume4.Display();
		
		//---------------深度克隆-----------------------
		System.out.println("---------------深度克隆-----------------------");
		DeepCopyResume DeepResume1 = new DeepCopyResume();
		DeepWorkExperience DeepWorkEp = new DeepWorkExperience();
		DeepResume1.setName("大卫。贝克汉姆");
		DeepResume1.setAge("42");
		DeepResume1.setSex("男");
		
		DeepWorkEp.setWorkdate("1992年-2003年");
		DeepWorkEp.setCompany("曼彻斯特联队");
		DeepResume1.setWorkExperience(DeepWorkEp);
		
		DeepCopyResume DeepResume2 = (DeepCopyResume)DeepResume1.Clone();
		DeepResume2.getWorkExperience().setWorkdate("2003年-2007年");;
		DeepResume2.getWorkExperience().setCompany("皇家马德里");
		
		DeepCopyResume DeepResume3=(DeepCopyResume)DeepResume1.Clone();
		DeepResume3.getWorkExperience().setWorkdate("2007年-2012年");
		DeepResume3.getWorkExperience().setCompany("洛杉矶银河");
		
		DeepCopyResume DeepResume4=(DeepCopyResume)DeepResume1.Clone();
		DeepResume4.getWorkExperience().setWorkdate("2012年-2013年");
		DeepResume4.getWorkExperience().setCompany("巴黎圣日耳曼");
		
		DeepResume1.Display();
		DeepResume2.Display();
		DeepResume3.Display();
		DeepResume4.Display();
		
		
		
		
	}

}

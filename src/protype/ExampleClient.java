package protype;

public class ExampleClient {

	public static void main(String[] args) {
		//---------------�������͵Ŀ�¡-----------------------
		System.out.println("---------------�������͵Ŀ�¡-----------------------");
		NormalResume normalResume1 = new NormalResume();
		normalResume1.setName("���������˺�ķ");
		normalResume1.setAge("42");
		normalResume1.setSex("��");
		normalResume1.setTimearea("1992��-2003��");
		normalResume1.setCompany("����˹������");
		
		NormalResume normalResume2=(NormalResume) normalResume1.Clone();
		normalResume2.setTimearea("2003��-2007��");
		normalResume2.setCompany("�ʼ������");
		
		NormalResume normalResume3=(NormalResume) normalResume1.Clone();
		normalResume3.setTimearea("2007��-2012��");
		normalResume3.setCompany("��ɼ�����");
		
		NormalResume normalResume4=(NormalResume) normalResume1.Clone();
		normalResume4.setTimearea("2012��-2013��");
		normalResume4.setCompany("����ʥ�ն���");
		
		normalResume1.Display();
		normalResume2.Display();
		normalResume3.Display();
		normalResume4.Display();
		
		//---------------ǳ��¡-----------------------
		System.out.println("---------------ǳ��¡-----------------------");
		ShallowCopyResume shallowResume1 = new ShallowCopyResume();
		ShallowWorkExperience shallowWorkEp = new ShallowWorkExperience();
		shallowResume1.setName("���������˺�ķ");
		shallowResume1.setAge("42");
		shallowResume1.setSex("��");
		
		shallowWorkEp.setWorkdate("1992��-2003��");
		shallowWorkEp.setCompany("����˹������");
		shallowResume1.setWorkExperience(shallowWorkEp);
		
		ShallowCopyResume shallowResume2 = (ShallowCopyResume)shallowResume1.Clone();
		shallowResume2.getWorkExperience().setWorkdate("2003��-2007��");
		shallowResume2.getWorkExperience().setCompany("�ʼ������");
		
		ShallowCopyResume shallowResume3=(ShallowCopyResume)shallowResume1.Clone();
		shallowResume3.getWorkExperience().setWorkdate("2007��-2012��");
		shallowResume3.getWorkExperience().setCompany("��ɼ�����");
		
		ShallowCopyResume shallowResume4=(ShallowCopyResume)shallowResume1.Clone();
		shallowResume4.getWorkExperience().setWorkdate("2012��-2013��");
		shallowResume4.getWorkExperience().setCompany("����ʥ�ն���");
		
		shallowResume1.Display();
		shallowResume2.Display();
		shallowResume3.Display();
		shallowResume4.Display();
		
		//---------------��ȿ�¡-----------------------
		System.out.println("---------------��ȿ�¡-----------------------");
		DeepCopyResume DeepResume1 = new DeepCopyResume();
		DeepWorkExperience DeepWorkEp = new DeepWorkExperience();
		DeepResume1.setName("���������˺�ķ");
		DeepResume1.setAge("42");
		DeepResume1.setSex("��");
		
		DeepWorkEp.setWorkdate("1992��-2003��");
		DeepWorkEp.setCompany("����˹������");
		DeepResume1.setWorkExperience(DeepWorkEp);
		
		DeepCopyResume DeepResume2 = (DeepCopyResume)DeepResume1.Clone();
		DeepResume2.getWorkExperience().setWorkdate("2003��-2007��");;
		DeepResume2.getWorkExperience().setCompany("�ʼ������");
		
		DeepCopyResume DeepResume3=(DeepCopyResume)DeepResume1.Clone();
		DeepResume3.getWorkExperience().setWorkdate("2007��-2012��");
		DeepResume3.getWorkExperience().setCompany("��ɼ�����");
		
		DeepCopyResume DeepResume4=(DeepCopyResume)DeepResume1.Clone();
		DeepResume4.getWorkExperience().setWorkdate("2012��-2013��");
		DeepResume4.getWorkExperience().setCompany("����ʥ�ն���");
		
		DeepResume1.Display();
		DeepResume2.Display();
		DeepResume3.Display();
		DeepResume4.Display();
		
		
		
		
	}

}

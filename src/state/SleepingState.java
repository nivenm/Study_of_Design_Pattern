package state;

public class SleepingState extends State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("��ǰʱ�䣺"+w.getHour()+"�㲻���ˣ�˯����");
	}

}

package state;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("��ǰʱ�䣺"+w.getHour()+"�㣬�°�ؼ���");
	}

}

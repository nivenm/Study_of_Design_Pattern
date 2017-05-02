package state;

public class ForenoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 12) {
			System.out.println("��ǰʱ�䣺" + w.getHour() + "�� ���繤��������ٱ�");

		} else {
			w.setState(new NoonState());
			w.WriteProgram();
		}
	}

}

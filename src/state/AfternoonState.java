package state;

public class AfternoonState extends State {

	@Override
	public void WriteProgram(Work w) {
		if (w.getHour() < 17) {
			System.out.println("��ǰ��ʱ��"+w.getHour()+"�㣬����״̬��������Ŭ����");
		} else {
			w.setState(new EveningState());
			w.WriteProgram();
		}
	}

}

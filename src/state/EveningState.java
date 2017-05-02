package state;

public class EveningState extends State {

	@Override
	public void WriteProgram(Work w) {
		if (w.isFinished()) {
			w.setState(new RestState());
			w.WriteProgram();
		} else {
			if (w.getHour() < 21) {
				System.out.println("��ǰʱ�䣺" + w.getHour() + "�� �Ӱ�Ŷ��ƣ��֮��");
			} else {
				w.setState(new SleepingState());
				w.WriteProgram();
			}
		}
	}

}

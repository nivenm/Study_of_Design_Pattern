package state;

public class RestState extends State {

	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"点，下班回家了");
	}

}

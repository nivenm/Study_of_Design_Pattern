package state;

public class Work {
	private State current;
	public Work(){
		current = new ForenoonState();
	}
	private double hour;
	private boolean finished=false;
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	public void setState(State s){
		current= s;
	}
	public void WriteProgram(){
		current.WriteProgram(this);
	}

}

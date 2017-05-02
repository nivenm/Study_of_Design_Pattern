package simple_factory;

public abstract class Operation {
	protected double NumberA;
	protected double NumberB;
	public double getNumberA() {
		return NumberA;
	}
	public void setNumberA(double numberA) {
		NumberA = numberA;
	}
	public double getNumberB() {
		return NumberB;
	}
	public void setNumberB(double numberB) {
		NumberB = numberB;
	}
	public abstract double getResult();
 
}

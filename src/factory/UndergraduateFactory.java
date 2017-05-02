package factory;

public class UndergraduateFactory implements ILeiFengFactory {

	@Override
	public ILeifeng createLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}

package factory;

public class VolunteersFactory implements ILeiFengFactory {

	@Override
	public ILeifeng createLeiFeng() {
		return new Volunteers();
	}

}

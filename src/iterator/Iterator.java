package iterator;
/**
 * ³éÏóµÄµü´úÆ÷
 * @author wangth89
 *
 */
public abstract class Iterator {
	public abstract Object First();

	public abstract Object Next();

	public abstract boolean IsDone();

	public abstract Object CurrentItem();

}

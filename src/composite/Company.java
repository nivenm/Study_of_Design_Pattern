package composite;
/**
 * ����Compsite���������ĳ����ࣨ����Ҳ�����ǽӿڣ�
 * @author wangth89
 *
 */
public abstract class Company {
	protected String name;

	public Company(String name) {
		this.name = name;
	}

	public abstract void Add(Company c);

	public abstract void Remove(Company c);

	public abstract void Display(int depth);

	public abstract void LineOfDuty();
	
	protected String getMinusSymbol(int depth){
		String symbol="";
		for(int i=1;i<=depth;i++){
			symbol+="-";
		}
		return symbol;
		
	}

}

package memento;
/**
 * 备忘类负责记录发起备忘的那个类的状态
 * @author wangth89
 *
 */
public class RoleMemento {
	private int vitality;
	private int attack;
	private int defensive;

	public RoleMemento(int vitality ,int attack,int defensive) {
		this.vitality=vitality;
		this.attack=attack;
		this.defensive=defensive;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality(int vitality) {
		this.vitality = vitality;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefensive() {
		return defensive;
	}

	public void setDefensive(int defensive) {
		this.defensive = defensive;
	}

}

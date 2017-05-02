package memento;
/**
 * 备忘发起类
 * @author wangth89
 *
 */
public class GameRole {
	String name;

	public GameRole(String name) {
		this.name = name;
	}

	private int vitality;
	private int attack;
	private int defensive;

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

	public void display() {
		System.out.println("角色：" + name + "生命值：" + vitality);
		System.out.println("角色：" + name + "攻击力：" + attack);
		System.out.println("角色：" + name + "防御力：" + defensive);
	}

	public void initSate() {
		this.vitality = 100;
		this.attack = 100;
		this.defensive = 100;
	}
	//发起备忘
	public RoleMemento saveState(){
		return new RoleMemento(this.getVitality(),this.getAttack(),this.getDefensive());
	}
	
	public void recoveryState(RoleMemento rolememento){
		this.setVitality(rolememento.getVitality());
		this.setAttack(rolememento.getAttack());
		this.setDefensive(rolememento.getDefensive());
	}

	public void defeated() {
		this.vitality = 0;
		this.attack = 0;
		this.defensive = 0;
	}
}

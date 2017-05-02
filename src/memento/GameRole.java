package memento;
/**
 * ����������
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
		System.out.println("��ɫ��" + name + "����ֵ��" + vitality);
		System.out.println("��ɫ��" + name + "��������" + attack);
		System.out.println("��ɫ��" + name + "��������" + defensive);
	}

	public void initSate() {
		this.vitality = 100;
		this.attack = 100;
		this.defensive = 100;
	}
	//������
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

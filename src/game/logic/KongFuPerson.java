package game.logic;

public class KongFuPerson extends Person{
	protected int blood = 1000;
	KongFuPerson(){}
	KongFuPerson(String name){
		this.name = name;
	}
	public void commonSkill(KongFuPerson p){
		p.blood -= 50;
		//System.out.println(this.name+"ʹ������ͨ����");
	}
	public void killSkill(KongFuPerson p){
		p.blood -= 100;
		//System.out.println(this.name+"ʹ���˱�ɱ����");
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}

}

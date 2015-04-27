package game.logic;

public class KongFuPerson extends Person{
	protected int blood = 1000;
	KongFuPerson(){}
	KongFuPerson(String name){
		this.name = name;
	}
	public void commonSkill(KongFuPerson p){
		p.blood -= 50;
		//System.out.println(this.name+"使用了普通招数");
	}
	public void killSkill(KongFuPerson p){
		p.blood -= 100;
		//System.out.println(this.name+"使用了必杀招术");
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}

}

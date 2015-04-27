package game.roles;

import game.logic.KongFuMaster;
import game.logic.KongFuPerson;

public class LingHuChong extends KongFuMaster{
	public LingHuChong() {
		// TODO Auto-generated constructor stub
	}
	public LingHuChong(String name){
		this.name = name;
	}

	@Override
	public void serects(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.serects(p);
		System.out.println(this.getName()+"使用绝学独孤九剑攻击"+p.getName()+"300点血");
	}

	@Override
	public void commonSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.commonSkill(p);
		System.out.println(this.getName()+"使用普通攻击"+p.getName()+"50点血");
	}

	@Override
	public void killSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.killSkill(p);
		System.out.println(this.getName()+"使用杀招攻击"+p.getName()+"100点血");
	}
	 

}

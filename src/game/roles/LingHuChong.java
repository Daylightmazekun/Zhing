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
		System.out.println(this.getName()+"ʹ�þ�ѧ���¾Ž�����"+p.getName()+"300��Ѫ");
	}

	@Override
	public void commonSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.commonSkill(p);
		System.out.println(this.getName()+"ʹ����ͨ����"+p.getName()+"50��Ѫ");
	}

	@Override
	public void killSkill(KongFuPerson p) {
		// TODO Auto-generated method stub
		super.killSkill(p);
		System.out.println(this.getName()+"ʹ��ɱ�й���"+p.getName()+"100��Ѫ");
	}
	 

}

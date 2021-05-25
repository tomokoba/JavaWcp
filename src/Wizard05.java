
public class Wizard05 {
	String name;
	int hp;
	
	public void heal(Hero05 h) {
		h.hp += 10;
		System.out.println(this.name + "は" + h.name + "のHPを10回復した！");
	}
}

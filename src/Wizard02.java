
public class Wizard02 {
	String name;
	int hp;
	public void heal(Hero02 h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}

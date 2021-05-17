
public class Main2 {
	public static void main(String[] args) {
	Sword02 s = new Sword02();
	s.name = "炎の剣";
	s.damage = 10;
	Hero02 h = new Hero02();
	h.name = "ともぞー";
//	h.hp = 100;
	h.sword = s;
	System.out.println(h.hp);

	Hero02 h1 = new Hero02();
	h1.name = "こばた";
//	h1.hp = 50;
	System.out.println(h1.hp);

	Wizard02 w = new Wizard02();
	w.name = "ゆう";
	w.hp = 50;
	w.heal(h);
	w.heal(h1);
	System.out.println("現在の" + h.name + "のHPは" + h.hp);
	System.out.println("現在の" + h1.name + "のHPは" + h1.hp);
	System.out.println("現在の武器は" + h.sword.name);
	h.attack();
	}
}

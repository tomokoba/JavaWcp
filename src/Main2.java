
public class Main2 {
	public static void main(String[] args) {
	Sword02 s = new Sword02();
	s.name = "炎の剣";
	s.damage = 10;
	Hero02 h = new Hero02();
	h.name = "ともぞー";
	h.hp = 100;
	h.sword = s;
	System.out.println("現在の武器は" + h.sword.name);
	h.attack();
	}
}

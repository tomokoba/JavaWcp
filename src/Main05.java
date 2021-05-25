
public class Main05 {
	public static void main(String[] args) {
		Sword05 s = new Sword05();
		s.name = "炎の剣";
		s.damage = 10;

		Hero05 h = new Hero05("ともこ");
//		h.name = "ともこ";
//		h.hp = 100;
		h.sword = s;
		System.out.println(h.name + "のHPは" + h.hp + "です");
		System.out.println(h.name + "の現在の武器は" + h.sword.name);
		h.attack();

		Hero05 h1 = new Hero05("ばたこ");
//		h1.name = "ばたこ";
//		h1.hp = 100;
		h1.sword = s;
		h1.attack();

		Hero05 h2 = new Hero05();
		System.out.println("コンストラクトをオーバーロードした時の勇者の名前は"+ h2.name);

		Wizard05 w = new Wizard05();
		w.name = "魔女";
		w.hp = 10;
		w.heal(h);
		w.heal(h1);
	}
}

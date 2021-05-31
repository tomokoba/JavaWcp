
public class PoisonMatango07 extends Matango07 {
	int poisonCount = 5;
	public PoisonMatango07 (char suffix) {
		super(suffix);
	}
	public void attack(Hero07 h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ！");
			this.poisonCount--;
			System.out.println(h.name + "のHPは" + h.hp + "になった！");
		}
	}
}

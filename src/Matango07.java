
public class Matango07 {
	int hp = 50;
	char suffix;
	public Matango07(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero07 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
		System.out.println(h.name + "のhpは" + h.hp + "になった");
	}
}


public class Dancer08 extends Character08 {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack(Matango08 m) {
		System.out.println(this.name + "の攻撃");
		System.out.println(m.name + "に3ポイントのダメージ");
		m.hp -= 3;
	}
}

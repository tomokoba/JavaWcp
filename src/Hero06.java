
public class Hero06 {
	String name = "ともこ";
	int hp = 100;

	// 戦う
	public void attack(Matango06 m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println(m.suffix + "に5ポイントのダメージをあたえた！");
	}

	public final void slip() { // 子クラスでオーバーライド禁止
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("5のダメージ");
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}

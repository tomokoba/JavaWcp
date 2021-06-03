
public class Hero07 {
	String name = "ともぞー";
	int hp = 100;
	public void attack (Matango07 m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("10のダメージ");
		m.hp -= 10;
		System.out.println(m.suffix + "のHPが" + m.hp + "になった！");
	}
}

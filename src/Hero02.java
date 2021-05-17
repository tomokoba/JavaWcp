
public class Hero02 {
	String name;
	int hp;
	Sword02 sword;
	public void attack() {
		System.out.println(this.name + "は" + sword.name +"で攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
	public Hero02() { // コンストラクタ
		this.hp = 100; // hpフィールドを100で初期化（newされた直後に自動的に実行される処理）
	}
}


public class Hero05 {
	String name;
	int hp;
	Sword05 sword;

	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した!");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	public Hero05(String name) { // コンストラクタ（newされた直後に自動的に実行される）
		this.hp = 100; // hpフィールドを100で初期化
		this.name = name; // 引数の値でnameフィールドを初期化
	}

	public Hero05() { // コンストラクタのオーバーロード
//		this.hp = 100;
//		this.name = "ダミー";
		this("ダミー"); // 上記のコンストラクタを呼び出すように、JVNに依頼する
	}
}

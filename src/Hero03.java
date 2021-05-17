
public class Hero03 {
	String name;
	int hp;

	public Hero03(String name) { // コントラスタ① 引数として文字列を1つ受け取る
		this.hp = 100;
		this.name = name; // 引数の値でnamフィールドを初期化
	}
	public Hero03() {
		this("ダミー"); // コントラスタ①を呼び出す
//		this.hp = 100;
//		this.name = "ダミー";
	}
}

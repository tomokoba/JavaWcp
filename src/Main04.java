
public class Main04 {
	public static void main(String[] args) {
		Hero04 h = new Hero04(); // インスタンスの生成（クラス名 変数名 new クラス名();）
		h.name = "ともこ";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		Matango04 m1 = new Matango04();
		m1.hp = 50;
		m1.suffix = 'A';
		m1.run();
	}
}

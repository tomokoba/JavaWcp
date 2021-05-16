import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAXHP;
		System.out.println("HPが最大まで回復した");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		System.out.println("現在のMPは" + this.mp + "です");
		return recoverActual;
	}
}

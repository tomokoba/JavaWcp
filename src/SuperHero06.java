
public class SuperHero06 extends Hero06 { // Heroクラスを継承
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した！");
	}
	public void attack(Matango06 m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
	public SuperHero06() {
		super();
		System.out.println("SuperHero06のコンストラクタが動作");
	}
}

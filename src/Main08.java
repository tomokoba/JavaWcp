
public class Main08 {
	public static void main(String[] args) {
		Matango08 m = new Matango08();
		m.name = "毒キノコ";
		Matango08 m1 = new Matango08();
		m1.name = "きのこ";
		Dancer08 d = new Dancer08();
		d.name = "ともこ";
		d.attack(m);
		d.attack(m1);
	}
}

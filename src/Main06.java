
public class Main06 {
	public static void main(String[] args) {
		Hero06 h = new Hero06();
		h.run();
		SuperHero06 sh = new SuperHero06();
		sh.run();
		sh.land();
		Matango06 m = new Matango06();
		m.suffix = 'A';
		sh.attack(m);
		Weapon06 w = new Weapon06();
	}
}

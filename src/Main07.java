
public class Main07 {
	public static void main(String[] args) {
		Hero07 h = new Hero07();
		Matango07 m = new Matango07('A');
		m.attack(h);
		PoisonMatango07 pm = new PoisonMatango07('B');
		pm.attack(h);
	}
}

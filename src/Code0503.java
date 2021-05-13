
public class Code0503 {
	public static void methodA() {
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}
	// mainメソッドより上に別のメソッドが定義されていても、プログラムは必ずmainメソッドから動き始める
}

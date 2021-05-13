
public class Code0504 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("ともこ");
		hello("tomoko");
		hello("tomokoba");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
}

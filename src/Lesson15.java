
public class Lesson15 {
	public static void main(String[] args) {
		
		//ランダムな数を生成する命令
		int r = new java.util.Random().nextInt(100);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		
		// キーボードから1行の文字列の入力を受け付ける
		System.out.println("あなたの名前を入力してください。");
		String name = new java.util.Scanner(System.in).nextLine();
		
		// キーボードから1つの整数の入力を受け付ける
		System.out.println("あなたの年齢を入力してください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println
		("ようこそ、" + age + "歳の" + name + "さん");
	}
}

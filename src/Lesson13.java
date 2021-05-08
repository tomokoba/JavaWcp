
public class Lesson13 {
	public static void main(String[] args) {
		//①命令実行の文(画面に表示する)
		//変数宣言の文
		String name = "こばた";
	    String message;
	    //計算の文
	    message = name + "さん、こんにちは";
	    //命令実行の文
	    System.out.println(message);
	    System.out.println(name + "さん、こんばんは");
	    
	    //②改行なし画面出力の命令
	    String firstName = "ともこ";
	    System.out.print("私の名前は");
	    System.out.print(firstName);
	    System.out.print("です");
	    
	    //大きい方の数値を代入する命令 Math.max( , );
	    int a = 5;
	    int b = 3;
	    int m = Math.max(a, b);
	    System.out.println("比較実験" + a + "と" + b + "とで大きい方は・・・" + m);
	    
	}
}

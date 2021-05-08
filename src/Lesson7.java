
public class Lesson7 {
	public static void main(String[] args) {
		
		//変数の書き換え防止...定数(final)定数名は大文字
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします。");
		//定数を書き換える(エラーになる)
//		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);		
	}
}

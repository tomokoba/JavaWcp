
public class Lesson11 {
	public static void main(String[] args) {
		//値より大きな型の変数に代入(自動型変換が行われる)
		float f = 3;
		double d =f;
		System.out.println(f);
		System.out.println(d);
		
		//強制的な型変換(int)キャスト演算子
		int age = (int)3.2;
		System.out.println(age);
		
		//異なる型同士の算術演算子
		double dn = 8.5 / 2; //2(int型)を2.0(double型)に変換
		long l = 5 + 2L; //5(int型)を5L(long型)に変換
		System.out.println(dn);
		System.out.println(l);
		
		//文字列の連結
		String msg = "私の年齢は" + 28; //23(int型)が"23"(String型)に変換されて連結
		System.out.println(msg);
		
	}
}

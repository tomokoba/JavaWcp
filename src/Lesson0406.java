
public class Lesson0406 {
	public static void main(String[] args) {
//		//変数xが初期化されていないので、コンパイルエラーになる
//		int x;
//		System.out.println(x);
		
		// 配列は自動的に初期化される
		int[] scores = new int[5];
		System.out.println(scores[1]); //0が出力される(エラーにならない)
	}
}

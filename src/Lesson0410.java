
public class Lesson0410 {
	public static void main(String[] args) {
		// 点数管理プログラム(for文の利用)
		int[] scores = {100, 20, 40, 80, 60};
		int sum = 0; // 変数結果を入れるための変数を初期化して準備
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}

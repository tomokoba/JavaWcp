
public class Lesson0411 {
	// 50点以上の科目の数を調べる
	public static void main(String[] args) {
		int[] scores = {10, 30, 40, 80, 90};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は:" + count);
	}
}

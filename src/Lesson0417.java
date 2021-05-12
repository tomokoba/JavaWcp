
public class Lesson0417 {
	public static void main(String[] args) {
		// nullの利用(エラー)
		int[] array = {1, 2, 3};
		array = null;
		array[0] = 10;
	}
}

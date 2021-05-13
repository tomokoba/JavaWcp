
public class Code042 {
	public static void main(String[] args) {
		int[] moneyList = {121902, 8302, 55100};

		for(int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}

		// 拡張for文
		for(int value : moneyList) {
			System.out.println(value);
		}
	}
}

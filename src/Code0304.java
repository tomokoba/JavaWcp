
public class Code0304 {
	public static void main(String[] args) {
		//冗長なソースコード(switch文にできる)
		System.out.println("あなたの運勢を占います");
		//1~4の乱数発生
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉");
		} else if (fortune == 2) {
			System.out.println("中吉");
		} else if (fortune == 3) {
			System.out.println("吉");
		} else {
			System.out.println("凶");
		}		
	}
}

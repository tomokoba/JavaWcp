
public class Lesson0303 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "ステーキ";
		System.out.println("こんにちは");
//		if (isHungry == 0) {
//			System.out.println("お腹がいっぱいです");
//		} else {
//			System.out.println("はらぺこです");
//		}
		System.out.println(isHungry == 0 ? "お腹がいっぱいです" : "はらぺこです" );
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}

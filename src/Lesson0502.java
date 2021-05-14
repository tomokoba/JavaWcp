
public class Lesson0502 {
	public static void main(String[] args) {
		String title = "ゴルフのお誘い";
		String address = "golf3190@xxx.com";
		String text = "今週の日曜日にゴルフに行きませんか";
		email(title, address, text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}

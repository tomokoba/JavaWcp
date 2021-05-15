
public class Lesson0506 {
	public static void main(String[] args) {
		String title = "あそびのお誘い";
		String address = "asobi@xxx.com";
		String text = "今週末、買い物にいきませんか？";
		email(title, address, text);
		
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}

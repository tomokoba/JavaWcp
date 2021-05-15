
public class Lesson0507 {
	public static void main(String[] args) {
		String address = "shigoto@xxx.com";
		String text = "本日15:00より会議があります";
		email(address, text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}
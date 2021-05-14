
public class Lesson0503 {
	public static void main(String[] args) {
		String address = "golf3190@xxx.com";
		String text = "今度ゴルフに行きませんか";
		email(address, text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールをおくりました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールをおくりました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
}

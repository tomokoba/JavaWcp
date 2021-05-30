
public class Item06 {
	String name;
	int price;
	public Item06(String name) {
		this.name = name;
		this.price = 0;
		System.out.println(this.name + "を選んだ！");
	}
	public Item06(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

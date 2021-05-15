
public class Lesson0508 {
	public static void main(String[] args) {
		double bottom = 10.0;
		double height = 5.0;
		calcTriangleArea(bottom, height);
		double radius = 5.0;
		calcCircleArea(radius);
	}
	public static void calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height) / 2;
		System.out.println("三角形の面積:" + ans + "平方cm");
	}
	public static void calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		System.out.println("円の面積:" + ans + "平方cm");
	}
}

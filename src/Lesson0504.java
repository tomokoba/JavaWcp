
public class Lesson0504 {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方cm");
		
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積は" + circleArea + "平方cm");
	}
	public static double calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height) / 2;
		return ans;
	}
	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
}

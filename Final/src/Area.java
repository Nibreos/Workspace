//Nathan Johnson
public class Area {

	public static final double pi = Math.PI;

	public static double Area(double radius) {
		return pi * radius * radius;

	}

	public static double Area(double radius, double height) {
		return 2 * pi * radius * (radius + height);

	}

	public static int Area(int height, int width) {
		return height * width;
	}
}

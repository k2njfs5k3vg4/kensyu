package kensyu;

public class Circle extends Figure {

	public static double pi = 3.14;
	public int r;

	public Circle() {

	}

	public Circle(int r) {
		this.r = r;
	}

	public double area() {
		return r * r * pi;
	}

}

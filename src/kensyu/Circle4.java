package kensyu;

public class Circle4 {
	public static final double PI = 3.14;
	private double radius;

	public Circle4(double radius) throws CalcException {
		if(0 >= radius) {
			throw new CalcException("半径が0以下です");
		}
		this.radius = radius;
	}
	public Circle4() {}

	public double area() {
		return radius * radius * PI;
	}
}

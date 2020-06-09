package kensyu;

public class Circle4 {

	private static final double PI = 3;
	private double radius;

	public Circle4(double radius) throws InvalidSizeException {
		if (radius <= 0) {
			throw new InvalidSizeException("半径が0以下です。");
		}
		this.radius = radius;
	}

	public double getRadius() {
		// TODO 自動生成されたメソッド・スタブ
		return radius;
	}

	public double area() {
		// TODO 自動生成されたメソッド・スタブ
		return radius * radius * PI;
	}

}

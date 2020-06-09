package kensyu;

public class Circle {
	public static final double PI = 3.14;
	public double r;

	public void Circle(double i) throws numException {
		if (i > 0) {
			this.r = i;
		} else {
			throw new numException("0以上の値にしてください。");
		}
	}

	public Double area() {
		return r * r * PI;
	}

}

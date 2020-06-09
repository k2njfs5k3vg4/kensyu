package kensyu;

class Circle4 {

	public static final double PI = 3.14;
	private double radius;

	public Circle4() {

	}

	public Circle4(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public Double area() {
		return radius * radius * PI;
	}

}

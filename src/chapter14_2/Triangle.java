package chapter14_2;

public class Triangle extends Figure {

	private int height;
	private int bottom;

	public Triangle(int height, int bottom) {
		this.height = height;
		this.bottom = bottom;

	}

	Triangle() {

	}

	public double areaCalc() {
		return this.height * this.bottom * 0.5;
	}

}

package chapter14_2;

public class Circle extends Figure {

	private int r;

	public Circle(int r) {
		this.r = r;
	}

	Circle() {
	}

	public double areaCalc() {
		return this.r * this.r * 3.14;
	}

}

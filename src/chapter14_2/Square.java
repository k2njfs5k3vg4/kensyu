package chapter14_2;

public class Square extends Figure {

	private int hen1;
	private int hen2;

	public Square(int hen1, int hen2) {
		this.hen1 = hen1;
		this.hen2 = hen2;
	}

	Square() {

	}

	public double areaCalc() {
		return this.hen1 * this.hen2;
	}

}

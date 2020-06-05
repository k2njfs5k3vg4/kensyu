package chapter13_4;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint() {
	}

	public String getColor() {
		return this.color;
	}

}

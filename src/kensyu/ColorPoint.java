package kensyu;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {

	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public Object getPointInfo() {
		return super.getPointInfo() + "\n" + "color：" + this.color;
	}

}

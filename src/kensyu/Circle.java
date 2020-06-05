package kensyu;

public class Circle extends Figure {

	private int radius;
	private int pi = 3;

	public Circle() {

	}

	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	int getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return radius * radius * pi;
	}

}

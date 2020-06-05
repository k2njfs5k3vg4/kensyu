package kensyu;

public class Square extends Figure {

	public int width;
	public int height;

	public Square() {

	}

	public Square(int width, int height) {
		this.width = width;
		this.height = height;

	}

	public double area() {
		return width * height;
	}
}

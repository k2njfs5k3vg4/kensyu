package kensyu;

public class Triangle extends Figure {

	public int teihen;
	public int height;

	public Triangle() {

	}

	public Triangle(int teihen, int height) {
		this.teihen = teihen;
		this.height = height;
	}

	public double area() {
		return (teihen * height) / 2;
	}

}

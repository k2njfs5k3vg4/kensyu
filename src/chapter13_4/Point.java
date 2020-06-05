package chapter13_4;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point() {

	}

	public Integer getX() {
		return this.x;
	}

	public Integer getY() {
		return this.y;
	}

	public String showInfo() {
		return "x:" + this.x + " y:" + this.y;
	}

}

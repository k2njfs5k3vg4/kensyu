package kensyu;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String showXY() {
		return "x:"+ x + " y:" + y;
	}

}

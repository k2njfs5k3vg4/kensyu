package kensyu;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		// TODO 自動生成されたメソッド・スタブ
		this.x = x;
	}

	public void setY(int y) {
		// TODO 自動生成されたメソッド・スタブ
		this.y = y;
	}

	public int getX() {
		// TODO 自動生成されたメソッド・スタブ
		return this.x;
	}

	public int getY() {
		// TODO 自動生成されたメソッド・スタブ
		return this.y;
	}

	public String showPoint() {
		// TODO 自動生成されたメソッド・スタブ
		return this.x + "," + this.y;
	}

}

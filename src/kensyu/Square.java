package kensyu;

public class Square extends Figure {

	private int bottom;
	private int top;
	private int height;

	public Square(int bottom, int top, int height) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.bottom = bottom;
		this.top = top;
		this.height = height;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	int getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return (bottom + top) * height / 2;
	}

}

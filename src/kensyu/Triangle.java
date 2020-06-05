package kensyu;

public class Triangle extends Figure {

	private int bottom;
	private int height;

	public Triangle(int bottom, int height) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.bottom = bottom;
		this.height = height;
	}

	@Override
	int getArea() {
		// TODO 自動生成されたメソッド・スタブ
		return bottom * height / 2;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

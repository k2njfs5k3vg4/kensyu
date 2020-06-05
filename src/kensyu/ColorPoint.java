package kensyu;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y) {
		super(x, y);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public ColorPoint() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getColor() {
		return color;
	}

	public String showInfo() {

		return super.showXY() + "\ncolor:" + color;
	}

}

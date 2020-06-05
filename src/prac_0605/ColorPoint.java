package prac_0605;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int i, int j, String string) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(i, j);
		color = string;
	}

	public ColorPoint() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Object getColor() {
		// TODO 自動生成されたメソッド・スタブ
		return color;
	}

	public Object getPoint() {
		// TODO 自動生成されたメソッド・スタブ
		return super.getPoint() + "," + color;
	}

}

package prac_0605;

public class Circle extends Figure {

	public int hankei;
	private int ans;

	public Circle(int i) {
		// TODO 自動生成されたコンストラクター・スタブ
		hankei = i;
	}

	public Circle() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void area() {
		ans = hankei * hankei * 3;
	}

	public Integer getArea() {
		// TODO 自動生成されたメソッド・スタブ
		area();
		return ans;
	}

}

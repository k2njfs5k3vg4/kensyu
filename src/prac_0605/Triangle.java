package prac_0605;

public class Triangle extends Figure {
	public int h;
	public int w;
	private int ans;

	public Triangle(int i, int j) {
		// TODO 自動生成されたコンストラクター・スタブ
		h = i;
		w = j;
	}

	public Triangle() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void area() {
		ans = h * w / 2;
	}

	public Integer getArea() {
		// TODO 自動生成されたメソッド・スタブ
		area();
		return ans;
	}

}

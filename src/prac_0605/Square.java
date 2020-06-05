package prac_0605;

public class Square extends Figure {
	public int h;
	public int w;
	private int ans;

	public Square(int i, int j) {
		// TODO 自動生成されたコンストラクター・スタブ
		h = i;
		w = j;
	}

	public Square() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void area() {
		ans = h * w;
	}

	public Integer getArea() {
		// TODO 自動生成されたメソッド・スタブ
		area();
		return ans;
	}

}

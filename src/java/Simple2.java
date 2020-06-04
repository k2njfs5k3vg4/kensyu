package java;

class A2 {
	int x;

	A2(int x) {
		this.x = 10;
		System.out.println("クラスAのコンストラクタを実行しました。");
	}
}

class B2 extends A2 {
	int y;

	B2() {
		super(10);
		y = 10;
		System.out.println("クラスBのコンストラクタを実行しました。");
	}
}

public class Simple2 {

	public static void main(String[] args) {
		B2 b = new B2();
		System.out.println("x:" + b.x + "y:" + b.y);

	}

}

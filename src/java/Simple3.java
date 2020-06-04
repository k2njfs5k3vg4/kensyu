package java;

class A3 {
	int x;

	A3() {
		x = 10;
		System.out.println("クラスAのコンストラクタを実行しました。");
	}
}

class B3 extends A3 {
	int y;

	B3() {
		y = 10;
		System.out.println("クラスBのコンストラクタを実行しました。");
	}
}

public class Simple3 {

	public static void main(String[] args) {
		B3 b = new B3();
		System.out.println("x:" + b.x + "y:" + b.y);

	}

}

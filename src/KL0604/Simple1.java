package KL0604;

class A {
	int x;

	A() {
		x = 10;
		System.out.println("クラスAのコンストラクタを実行しました。");
	}
}

class B extends A {
	int y;

	B() {
		y = 10;
		System.out.println("クラスBのコンストラクタを実行しました。");
	}
}

public class Simple1 {

	public static void main(String[] args) {
		B b = new B();
		System.out.println("x:" + b.x + "y:" + b.y);

	}

}

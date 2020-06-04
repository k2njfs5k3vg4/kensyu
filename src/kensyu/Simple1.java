package kensyu;

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
		y = 20;
		System.out.println("クラスBのコンストラクタを実行しました。");
	}
}

public class Simple1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		B b = new B();
		System.out.println("bのxの値は" + b.x + "、yの値は" + b.y + "です。");
	}

}

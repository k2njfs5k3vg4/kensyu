package kensyumaster;

//simple1.javaの作成、でバグ、コミット、プッシュ
//simple2.javaの作成、デバッグ、コミットプッシュ
//phone4.javaをtddで作成
//handyphone4.javaをtdd

class A {
	int x;

	A() {
		x = 10;
		System.out.println("クラスＡのコンストラクタを実行しました");
	}
}

class B extends A {
	int y;

	B() {
		y = 20;
		System.out.println("クラスＢのコンストラクタを実行しました。");
	}
}

public class Sinmple1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("bのxの値は" + b.x + "、yの値は" + b.y + "です");
	}

}

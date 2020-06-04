package Simple;

class A {
	int x;

	A() {
		x = 10;
		System.out.println("クラスAのコンストラクタを実行しました");
	}
}

class B extends A {
	int y;

	B() {
		y = 20;
		System.out.println("クラスBのコンストラクタを実行しました");
	}
}

class Simple1 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("bのxの値は" + b.x + "、yの値は" + b.y + "です");
	}
}

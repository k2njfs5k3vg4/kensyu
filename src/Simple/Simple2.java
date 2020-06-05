package Simple;

class A2 {
	int x;

	A2(int x) {
		this.x = x;
		System.out.println("クラスAのコンストラクタを実行しました");
	}
}

class B2 extends A2 {
	int y;

	B2() {
		super(10);
		this.y = 20;
		System.out.println("クラスBのコンストラクタを実行しました");
	}
}

class Simple2 {

	public static void main(String[] args) {
		B2 b = new B2();
		System.out.println("bのxの値は" + b.x + "、yの値は" + b.y + "です");
	}

}

package kensyumaster;

public class UsePerSon3 {

	public static void main(String[] args) {
		Person3 p1 = new Person3("ジョニー・アーチャー");
		System.out.println(p1.introduce());
		System.out.println();
		Person3 p2 = new Employee3("エフレン・レイズ", "営業部");
		System.out.println(p2.introduce());
	}

}

package kensyu2;

public class UsePerson3 {

	public static void main(String[] args) {
		Person3 p1 = new Person3("ジョニー");
		System.out.println(p1.introduce());
		System.out.println();

		Person3 p2 = new Employee3("エフレン", "営業部");
		System.out.println(p2.introduce());
	}

}

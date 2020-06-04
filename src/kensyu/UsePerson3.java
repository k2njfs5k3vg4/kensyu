package kensyu;

public class UsePerson3 {

	public static void main(String[] args) {
		Person3 p1 = new Person3("ジョニー・アーチャー");
		p1.introduce();
		System.out.println();
		Person3 p2 = new Employee3("エフレン・レイズ", "営業部");
		//p2.setDepartment("busyo");
		p2.introduce();
	}

}

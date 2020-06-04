package KL0604;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Employee3Test extends Employee3 {

	@Test
	void test1() {
		//		fail("まだ実装されていません");
		Employee3 e = new Employee3();
		e.setDepartment("営業部");
		Assertions.assertEquals("営業部", e.getDepartment());
	}

	@Test
	void test2() {
		//		fail("まだ実装されていません");
		Employee3 e = new Employee3("Mike", "営業部");
		//		e.setDepartment("営業部");
		Assertions.assertEquals("営業部", e.getDepartment());

	}

	@Test
	void test3() {
		//		fail("まだ実装されていません");
		Employee3 e = new Employee3("Mike", "営業部");
		//		e.setDepartment("営業部");
		Assertions.assertEquals("私はMikeと申します。営業部のMikeです。", e.introduce());

	}

}

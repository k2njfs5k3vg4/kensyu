package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Employee3Test extends Employee3 {

	@Test
	void test1() {
		//fail("まだ実装されていません");
		Employee3 p = new Employee3();
		//p.department="busyo";
		p.setDepartment("busyo");
		Assertions.assertEquals("busyo", p.getDepartment());
	}

	@Test
	void test2() {
		//fail("まだ実装されていません");
		Employee3 p = new Employee3("name", "department");
		//p.department="busyo";
		Assertions.assertEquals("所属はdepartmentです。", p.introduce());
	}

}

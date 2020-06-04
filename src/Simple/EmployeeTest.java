package Simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest extends Employee {

	//	@Test
	//	void test() {
	//		Employee3 e1 = new Employee();
	//		e1.department = "333";
	//
	//		Assertions.assertEquals("333", e1.department);
	//	}

	@Test
	void test2() {
		Employee e1 = new Employee();
		e1.setDepartment("333");

		Assertions.assertEquals("333", e1.getDepartment());
	}

	@Test
	void test3() {
		Employee e1 = new Employee();
		e1.setName("333");

		Assertions.assertEquals("333", e1.getName());
	}

	@Test
	void test4() {
		Employee e1 = new Employee("333", "444");

		Assertions.assertEquals("333", e1.getName());
		Assertions.assertEquals("444", e1.getDepartment());
	}
}

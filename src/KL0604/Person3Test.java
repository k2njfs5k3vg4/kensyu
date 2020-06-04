package KL0604;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	void test1() {
		Person3 p = new Person3();
		p.setName("Mike");
		Assertions.assertEquals("Mike", p.getName());
	}

	@Test
	void test2() {
		Person3 p = new Person3("Mike");
		Assertions.assertEquals("Mike", p.getName());
	}

	@Test
	void test3() {
		Person3 p = new Person3("Mike");
		Assertions.assertEquals("私はMikeと申します。", p.introduce());
	}

}

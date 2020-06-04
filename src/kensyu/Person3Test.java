package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Person3 p = new Person3();
		//p.name="jonny";
		p.setName("jonny");
		Assertions.assertEquals("jonny", p.getName());
	}

	@Test
	void test2() {
		//fail("まだ実装されていません");
		Person3 p = new Person3("jonny");
		//p.name="jonny";
		Assertions.assertEquals("私はjonnyと申します。", p.introduce());
	}

}

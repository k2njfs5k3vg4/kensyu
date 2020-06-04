package Simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	//	@Test
	//	void test() {
	//		Person3 pr = new Person3();
	//		pr.name = "murano";
	//		Assertions.assertEquals("murano", pr.name);
	//	}

	@Test
	void test2() {
		Person3 pr = new Person3();
		pr.setName("murano");
		Assertions.assertEquals("murano", pr.getName());
	}

	@Test
	void test3() {
		Person3 pr = new Person3("murano");
		Assertions.assertEquals("murano", pr.getName());
	}

}

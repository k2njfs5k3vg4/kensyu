package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Phone4Test extends Phone4 {

	@Test
	void test1() {
		//fail("まだ実装されていません");
		Phone4 p = new Phone4();
		//p.no = "090-8888-6666";
	}

	@Test
	void test2() {
		//fail("まだ実装されていません");
		Phone4 p = new Phone4();
		p.setNo("090-8888-6666");
		Assertions.assertEquals("090-8888-5555", p.tel("090-8888-5555"));
	}

	@Test
	void test3() {
		//fail("まだ実装されていません");
		Phone4 p = new Phone4("090-8888-5555");
	}

}

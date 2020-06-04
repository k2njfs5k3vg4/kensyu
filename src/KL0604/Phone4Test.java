package KL0604;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Phone4Test extends Phone4 {

	@Test
	void test1() {
		Phone4 p = new Phone4();
		p.setNo("111");
		Assertions.assertEquals("111", p.getNo());
	}

	@Test
	void test2() {
		Phone4 p = new Phone4("111");
		Assertions.assertEquals("111", p.getNo());
	}

}

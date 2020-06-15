package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_2Test {

	@Test
	void test() {
		Lesson10_2 a = new Lesson10_2();
		Assertions.assertEquals("9 : 木間 : 24 : 080-1111-2222", a.insertSql(9, "木間", 24, "080-1111-2222"));
	}

}

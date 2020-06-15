package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Kakunin10_3_3Test extends Kakunin10_3_3 {

	@Test
	void test() {
		Kakunin10_3_3 k = new Kakunin10_3_3();
		Assertions.assertEquals("8:近藤:29: 09-999-9999", k.kensaku("近"));
	}

}

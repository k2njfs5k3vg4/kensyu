package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test1() {
		Square s = new Square(3, 2, 4);
		Assertions.assertEquals(3, s.getBottom());
		Assertions.assertEquals(2, s.getTop());
		Assertions.assertEquals(4, s.getHeight());
	}

	@Test
	void test2() {
		Square t = new Square(3, 2, 4);
		Assertions.assertEquals(10, t.getArea());
	}
}

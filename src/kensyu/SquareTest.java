package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest extends Square {

	@Test
	void test() {
		Square s = new Square();
		s.width = 1;
		s.height = 2;
		Assertions.assertEquals(2, s.area());
	}

	@Test
	void test1() {
		Figure s = new Square(1, 2);
		//s.width = 1;
		//s.height = 2;
		Assertions.assertEquals(2, s.area());
	}
}

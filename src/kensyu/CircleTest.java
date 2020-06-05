package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest extends Circle {

	@Test
	void test() {
		Circle c = new Circle();
		c.r = 1;
		//Circle.pi = 3.14;
		Assertions.assertEquals(3.14, c.area());
	}

	@Test
	void test1() {
		Circle c = new Circle(1);
		//c.r = 1;
		//Circle.pi = 3.14;
		Assertions.assertEquals(3.14, c.area());
	}

}

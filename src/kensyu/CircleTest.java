package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest extends Circle {

	@Test
	void test() {
		Circle c = new Circle(30);
		Assertions.assertEquals(30, c.getRadius());
	}

	@Test
	void test1() {
		Circle c = new Circle(30);
		Assertions.assertEquals(2700, c.getArea());
	}

}

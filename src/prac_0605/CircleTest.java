package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest extends Circle {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Circle c = new Circle();
		c.hankei = 2;
		Assertions.assertEquals(12, c.getArea());
	}

	@Test
	void test2() {
		Circle c = new Circle(5);
		Assertions.assertEquals(75, c.getArea());
	}

}

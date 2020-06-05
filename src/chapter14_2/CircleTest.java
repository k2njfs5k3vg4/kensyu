package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest extends Circle {

	@Test
	void test() {
		Circle c = new Circle(2);
		Assertions.assertEquals(12.56, c.areaCalc());
	}

}

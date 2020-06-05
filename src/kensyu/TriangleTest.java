package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void test1() {
		Triangle t = new Triangle(3, 2);
		Assertions.assertEquals(3, t.getBottom());
		Assertions.assertEquals(2, t.getHeight());
	}

	@Test
	void test2() {
		Triangle t = new Triangle(3, 2);
		Assertions.assertEquals(3, t.getArea());
	}

}

package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest extends Triangle {

	@Test
	void test() {
		Triangle t = new Triangle(2, 3);
		Assertions.assertEquals(3, t.areaCalc());

	}

}

package chapter13_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ColorPointTest extends ColorPoint {

	@Test
	void test() {
		ColorPoint cp = new ColorPoint(2, 3, "RED");
		Assertions.assertEquals("RED", cp.getColor());
	}

}

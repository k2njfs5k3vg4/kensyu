package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ColorPointTest extends ColorPoint {

	@Test
	void test() {
		//fail("まだ実装されていません");
		ColorPoint c = new ColorPoint(0, 1, "red");
		//c.color = "";
		Assertions.assertEquals("0,1,red", c.showPoint());
	}

	@Test
	void test2() {
		//fail("まだ実装されていません");
		ColorPoint c = new ColorPoint();
		c.setColor("red");
		Assertions.assertEquals("red", c.getColor());
	}

}

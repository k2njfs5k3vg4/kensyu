package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest extends Triangle {

	@Test
	void test() {
		Triangle t = new Triangle();
		t.teihen = 1;
		t.height = 2;
		Assertions.assertEquals(1, t.area());
	}

	@Test
	void test2() {
		Figure t = new Triangle(1, 2);
		//t.teihen = 1;
		//t.height = 2;
		Assertions.assertEquals(1, t.area());
	}

}

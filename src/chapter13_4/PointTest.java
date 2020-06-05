package chapter13_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest extends Point {

	@Test
	void test1() {
		Point p = new Point(2, 3);
		Assertions.assertEquals(2, p.getX());
		Assertions.assertEquals(3, p.getY());

	}

	@Test
	void test2() {
		Point p = new Point(2, 3);
		Assertions.assertEquals("x:2 y:3", p.showInfo());

	}

}

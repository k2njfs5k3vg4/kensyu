package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest extends Point {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Point p = new Point();
		p.setX(0);
		p.setY(1);
		Assertions.assertEquals(0, p.getX());
		Assertions.assertEquals(1, p.getY());
	}

	@Test
	void test1() {
		//fail("まだ実装されていません");
		Point p = new Point();
		p.setX(0);
		p.setY(1);
		Assertions.assertEquals("0,1", p.showPoint());
	}

	@Test
	void test2() {
		//fail("まだ実装されていません");
		Point p = new Point(0, 1);
		Assertions.assertEquals("0,1", p.showPoint());
	}
}

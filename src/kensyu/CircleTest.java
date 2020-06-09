package kensyu;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CircleTest extends Circle {

	//	@Test
	//	void test() {
	//		Circle c = new Circle();
	//		c.Circle(3);
	//		Assertions.assertEquals(3, c.r);
	//	}
	//
	//	@Test
	//	void test1() {
	//		Circle c = new Circle();
	//		c.Circle(2);
	//		Assertions.assertEquals(12.56, c.area());
	//	}

	@Test
	void test2() {
		try {
			Circle c = new Circle();
			c.Circle(0);
		} catch (numException e) {
			return;
		}
		fail();
	}

	@Test
	void test3() {
		try {
			Circle c = new Circle();
			c.Circle(-1);
		} catch (numException e) {
			return;
		}
		fail();
	}

	@Test
	void test4() {
		try {
			Circle c = new Circle();
			c.Circle(1);
		} catch (numException e) {
			fail();
		}
		return;
	}

}

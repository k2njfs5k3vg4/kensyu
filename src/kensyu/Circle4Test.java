package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Circle4Test extends Circle4 {

	//	@Test
	//	void test() {
	//		Circle4 cr = new Circle4();
	//		cr.radius = 1.5;
	//		Assertions.assertEquals(1.5, cr.getRadius());
	//	}

	@Test
	void test1() {
		Circle4 cr = new Circle4(1.5);
		Assertions.assertEquals(1.5, cr.getRadius());
	}

	@Test
	void test2() {
		Circle4 cr = new Circle4(1.5);
		Assertions.assertEquals(7.065, cr.area());
	}

}

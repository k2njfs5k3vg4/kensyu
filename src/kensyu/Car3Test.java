package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Car3Test extends Car3 {

	@Test
	void test() {
		Car3 car = new Car3();
		Assertions.assertEquals("ガソリンで動く", car.accell());
	}

}

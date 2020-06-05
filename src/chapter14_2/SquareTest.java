package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest extends Square {

	@Test
	void test1() {
		Square s = new Square(2, 3);
		Assertions.assertEquals(6, s.areaCalc());

	}

}

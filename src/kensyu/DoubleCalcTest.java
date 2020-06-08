package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleCalcTest extends DoubleCalc {

	//	@Test
	//	void test() {
	//		try {
	//			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.0" });
	//
	//		} catch (inValidStrings e) {
	//			fail();
	//		}
	//		return;
	//	}

	@Test
	void test2() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "ss", "2.0" });

		} catch (NumberFormatException | inValidStrings e) {
			e.printStackTrace();
			return;
		}
		fail();
	}

	@Test
	void test3() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.0" });

			Assertions.assertEquals(1.0, d1.doubles[0]);
			Assertions.assertEquals(2.0, d1.doubles[1]);
		} catch (Exception e) {
			fail();
		}
	}

}

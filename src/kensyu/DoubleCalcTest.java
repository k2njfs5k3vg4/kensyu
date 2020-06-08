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
	void test() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "ss" });
		} catch (NumberFormatException | inValidStrings e) {
			return;
		}
		fail();
	}

	@Test
	void test1() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "ss", "aa" });
		} catch (NumberFormatException | inValidStrings e) {
			return;
		}
		fail();
	}

	@Test
	void test2() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "ss", "2.0" });
		} catch (NumberFormatException | inValidStrings e) {
			return;
		}
		fail();
	}

	@Test
	void test3() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.0" });
			Assertions.assertEquals(1.0, d1.getDoubles()[0]);
			Assertions.assertEquals(2.0, d1.getDoubles()[1]);
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void test4() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.0" });
			Assertions.assertEquals(3.0, d1.Addition());
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void test5() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1", "2.0" });
			Assertions.assertEquals(3.0, d1.Addition());
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void test6() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.1", "2.2" });
			Assertions.assertEquals(3.3, d1.Addition());
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void test7() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.0", "3.0" });
			Assertions.assertEquals(6.0, d1.Addition());
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	void test8() {
		try {
			DoubleCalc d1 = new DoubleCalc(new String[] { "1.0", "2.1", "3.1", "4.0" });
			Assertions.assertEquals(10.2, d1.Addition());
		} catch (Exception e) {
			fail();
		}
	}

}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleCalcTest extends DoubleCalc {

	@Test
	void test() {
		String[] num = { "1.0", "2.0" };
		DoubleCalc d = new DoubleCalc();
		try {
			Assertions.assertEquals(3.0, d.doubleCalc(num));
		} catch (HikisuException e) {
			Assertions.fail();
		}
	}

	@Test
	void test1() {
		try {
			String[] num = { "1.0" };
			DoubleCalc d = new DoubleCalc();
			d.doubleCalc(num);
		} catch (HikisuException e) {
			return;
		}
		Assertions.fail();
	}

	@Test
	void test2() {
		try {
			String[] num = { "あ", "い" };
			DoubleCalc d = new DoubleCalc();
			d.doubleCalc(num);
		} catch (NumberFormatException e) {
			return;
		} catch (HikisuException e) {
			return;
		}
		Assertions.fail();
	}

}

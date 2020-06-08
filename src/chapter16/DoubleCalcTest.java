package chapter16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleCalcTest extends DoubleCalc {

	@Test
	void test1() {
		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "2.5", "3.2" };
		double num2;
		try {
			num2 = d.plus(num1);
			Assertions.assertEquals(5.7, num2);

		} catch (InvalidDoubleCalcException e) {
		}
	}

	@Test
	void test2() {
		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "2.5" };
		double num2;
		try {
			num2 = d.plus(num1);
		} catch (InvalidDoubleCalcException e) {
			return;
		}
		fail();
	}

	@Test
	void test3() {
		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "2", "3" };
		double num2;
		try {
			num2 = d.plus(num1);
		} catch (InvalidDoubleCalcException e) {
			return;
		}
		fail();
	}

	@Test
	void test4() {

		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "a", "3.2" };
		double num2;
		try {
			num2 = d.plus(num1);
		} catch (InvalidDoubleCalcException e) {
			return;
		}
		fail();
	}

	@Test
	void test5() {

		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "2.5", "3.2", "3.1" };
		double num2;
		try {
			num2 = d.plus(num1);
			Assertions.assertEquals(8.8, num2);
		} catch (InvalidDoubleCalcException e) {
			fail();
		}

	}

	@Test
	void test6() {

		DoubleCalc d = new DoubleCalc();
		String[] num1 = { "2.5", "3.2", "a" };
		double num2;
		try {
			num2 = d.plus(num1);
		} catch (InvalidDoubleCalcException e) {
			return;
		}
		fail();

	}

}

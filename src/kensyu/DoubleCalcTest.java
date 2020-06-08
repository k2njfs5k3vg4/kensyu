package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
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
	@DisplayName("文字が引数に入ってきたときにエラーを返す。")
	void test2() {
		String[] num = { "あ", "い" };
		DoubleCalc d = new DoubleCalc();
		try {
			d.doubleCalc(num);
		} catch (HikisuException e) {
			Assertions.fail();
		} catch (NumberFormatException e) {
			Assertions.assertEquals("正しい値を入れろ", e.getMessage());
			return;
		}
		Assertions.fail();
	}

	@Test
	void test4() {
		try {
			String[] num = { "1.0", "2.0", "3.0" };
			DoubleCalc d = new DoubleCalc();
			d.doubleCalc(num);
		} catch (HikisuException e) {
			Assertions.fail();
		}
	}

	@Test
	void test5() {
		Double sum;
		String[] num = { "2.515851585158", "3.46964696469" };
		try {
			DoubleCalc d = new DoubleCalc();
			sum = d.doubleCalc(num);
			Assertions.assertEquals(5.98549854985, sum);
		} catch (HikisuException e) {
			Assertions.fail();
		}
	}

}

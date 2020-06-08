package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DoubleCalcTest {


	@Test
	@DisplayName("引数を2つ配列でとって足して返す")
	void test1() {

		try {
			double arr [] = {2.45, 3.14};
			DoubleCalc d;
			d = new DoubleCalc(arr);
			Assertions.assertEquals(5.59, d.add());
		} catch (IllegalArg_Exception e) {
			fail();
		}
	}

	@Test
	@DisplayName("引数が2未満のときエラー")
	void test2() {
		try {
			double arr [] = {2.45};
			DoubleCalc d = new DoubleCalc(arr);
		} catch (IllegalArg_Exception e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("引数が整数のとき")
	void test3() {
		try {
			double arr [] = {2, 3};
			DoubleCalc d = new DoubleCalc(arr);
		} catch (IllegalArg_Exception e) {
			fail();
		}
		return;
	}

	@Test
	@DisplayName("引数がStringのとき")
	void test4() {
		try {
			String arr [] = {"2.3", "3.5"};
			DoubleCalc d = new DoubleCalc(arr);
		} catch (IllegalArg_Exception e) {
			fail();
		}
		return;
	}

	@Test
	@DisplayName("引数がStringの文字のとき")
	void test5() {
		try {
			String arr [] = {"あ", "う"};
			DoubleCalc d = new DoubleCalc(arr);
		} catch (IllegalArg_Exception | NumberFormatException e) {
			return;
		}
		fail();
	}


	@Test
	@DisplayName("引数が2つ以上のとき")
	void test6() {
		try {
			double arr [] = {2.0, 3.0, 5.0};
			DoubleCalc d = new DoubleCalc(arr);
			Assertions.assertEquals(10.0, d.add());
		} catch (IllegalArg_Exception e) {
			fail();
		}
	}

	@Test
	@DisplayName("引数がnullのとき")
	void test7() {
		try {
			double arr [] = null;
			DoubleCalc d = new DoubleCalc(arr);
			Assertions.assertEquals(10.0, d.add());
		} catch (IllegalArg_Exception e) {
			fail();
		}
	}

}

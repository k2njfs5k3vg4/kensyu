package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DoubleCaleTest extends DoubleCale {

	@Test
	void test() {
		try {
			String[] s = { "1", "2" };
			//		s[1] = "";
			DoubleCale d = new DoubleCale();
			//			double a = Double.valueOf();
			Assertions.assertEquals(3, calc(s));
		} catch (NumberFormatException e) {
			Assertions.fail();
		}

	}

	@Test
	void test2() throws CalcExpection {
		String[] s = { "1" };
		//		s[1] = "";
		DoubleCale d = new DoubleCale();
		//			double a = Double.valueOf();
	}

	@Test
	void test3() {
		String[] s = { "1.1", "2.0" };
		//		s[1] = "";
		DoubleCale d = new DoubleCale();
		//			double a = Double.valueOf();
		Assertions.assertEquals(3.1, calc(s));

	}

}

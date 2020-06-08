package kensyu;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class DoubleCaleTest extends DoubleCale {

	@Test
	void test() throws CalcExpection {
		String[] s = new String[2];
		s[0] = "111";
		s[1] = "222";
		DoubleCale d = new DoubleCale();
		//			double a = Double.valueOf();
		calc(s[0], s[1]);
	}

	@Test
	void test2() {
		try {
			String[] s = new String[2];
			s[0] = "111";
			//		s[1] = "";
			DoubleCale d = new DoubleCale();
			//			double a = Double.valueOf();
			calc(s[0], s[1]);
		} catch (IOException i) {
			return;
		}
		fail();
	}

}

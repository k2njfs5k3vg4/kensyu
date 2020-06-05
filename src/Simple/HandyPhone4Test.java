package Simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhone4Test extends HandyPhone4 {

	@Test
	void test() {
		HandyPhone4 p1 = new HandyPhone4();

		p1.mailAddress = "55555";
		Assertions.assertEquals("55555", p1.mailAddress);
	}

	@Test
	void test2() {
		HandyPhone4 p1 = new HandyPhone4();

		p1.setMailAddress("55555");
		Assertions.assertEquals("55555", p1.getMailAddress());
	}

	@Test
	void test3() {
		HandyPhone4 p1 = new HandyPhone4("77777", "4444");

		Assertions.assertEquals("77777", p1.getNo());
		Assertions.assertEquals("4444", p1.getMailAddress());
	}

}

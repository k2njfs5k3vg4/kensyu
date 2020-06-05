package murano_kima.kima;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test() {
		HandyPhone p1 = new HandyPhone();

		p1.mailAddress = "55666";

		Assertions.assertEquals("55666", p1.mailAddress);
	}

	@Test
	void test2() {
		HandyPhone p1 = new HandyPhone();

		p1.mailAddress = "55666";

		Assertions.assertEquals("55666", p1.getAddress());
	}
}

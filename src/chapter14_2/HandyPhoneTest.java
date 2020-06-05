package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test() {
		HandyPhone h = new HandyPhone();
		h.setMailaddress("aaa");
		Assertions.assertEquals("aaa", h.getMailAddress());
	}

}

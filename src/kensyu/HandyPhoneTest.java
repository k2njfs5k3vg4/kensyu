package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhoneTest extends HandyPhone {

	@Test
	void test() {
		//fail("まだ実装されていません");
		HandyPhone h1 = new HandyPhone();
		h1.mailAddress = "myfriend@zzz.yyy.com";
		Assertions.assertEquals("myfriend@zzz.yyy.comからaへメールしました。", h1.mail("a"));
	}

}

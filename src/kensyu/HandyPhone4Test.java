package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HandyPhone4Test extends HandyPhone4 {

	@Test
	void test() {
		//fail("まだ実装されていません");
		HandyPhone4 h = new HandyPhone4();
		//h.mailAddress = "m";
		h.setMailAddress("m");
		Assertions.assertEquals("m", h.getMailAddress());

	}

	@Test
	void test1() {
		//fail("まだ実装されていません");
		HandyPhone4 h = new HandyPhone4();
		h.setMailAddress("m");
		h.setNo("090");
		Assertions.assertEquals("address", h.mail("address"));
		Assertions.assertEquals(null, h.info());
	}

	@Test
	@DisplayName("コンストラクタの生成")
	void test2() {
		HandyPhone4 h = new HandyPhone4("090", "mailAddress");
	}

}

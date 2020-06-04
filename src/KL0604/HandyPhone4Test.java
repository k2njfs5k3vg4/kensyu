package KL0604;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HandyPhone4Test extends HandyPhone4 {

	@Test
	void test() {
		//		fail("まだ実装されていません");
		HandyPhone4 p = new HandyPhone4();
		p.setMailAddress("aaa@bbb.com");
		Assertions.assertEquals("aaa@bbb.com", p.getMailAddress());
	}

	@Test
	void test2() {
		//		fail("まだ実装されていません");
		HandyPhone4 p = new HandyPhone4("111", "aaa@bbb.com");
		//		p.setMailAddress("aaa@bbb.com");
		Assertions.assertEquals("aaa@bbb.com", p.getMailAddress());
	}

	@Test
	void test3() {
		//		fail("まだ実装されていません");
		HandyPhone4 p = new HandyPhone4("111", "aaa@bbb.com");
		//		p.setMailAddress("aaa@bbb.com");
		Assertions.assertEquals("111", p.getNo());
	}

}

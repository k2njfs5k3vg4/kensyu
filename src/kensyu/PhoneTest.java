package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Phone p1 = new Phone();
		p1.no = "090-8888-6666";
		Assertions.assertEquals("090-8888-6666からaへ電話しました。", p1.tel("a"));
	}

}

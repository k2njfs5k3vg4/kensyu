package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartPhoneTest {

	@Test
	void test() {
		SmartPhone sp = new SmartPhone("5555", "smurano@gmail.com");
		Assertions.assertEquals("5555", sp.getNo());
		Assertions.assertEquals("smurano@gmail.com", sp.getMailAddress());
	}

	@Test
	void test2() {
		SmartPhone sp = new SmartPhone("5555", "smurano@gmail.com");
		Assertions.assertEquals("音楽をスタートしました", sp.play());
		Assertions.assertEquals("音楽をストップしました", sp.stop());
	}

	@Test
	void test3() {
		SmartPhone sp = new SmartPhone("5555", "smurano@gmail.com");
		Assertions.assertEquals("muranoへアップロードしました", sp.upload("murano"));
		Assertions.assertEquals("muranoからダウンロードしました", sp.download("murano"));
	}
}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartPhoneTest extends SmartPhone {

	@Test
	void test() {
		SmartPhone s1 = new SmartPhone();

		s1.setMailAddress("333");
		s1.setNo("444");

		Assertions.assertEquals("スマートフォン アップロード", s1.upload());
		Assertions.assertEquals("スマートフォンダウンロード", s1.download());
		Assertions.assertEquals("スマートフォン 再生", s1.play());
		Assertions.assertEquals("スマートフォン 停止", s1.stop());
		Assertions.assertEquals("333", s1.getMailAddress());
		Assertions.assertEquals("444", s1.getNo());
	}

	@Test
	void test2() {
		SmartPhone s1 = new SmartPhone("333", "444");

		Assertions.assertEquals("スマートフォン アップロード", s1.upload());
		Assertions.assertEquals("スマートフォンダウンロード", s1.download());
		Assertions.assertEquals("スマートフォン 再生", s1.play());
		Assertions.assertEquals("スマートフォン 停止", s1.stop());
		Assertions.assertEquals("333", s1.getMailAddress());
		Assertions.assertEquals("444", s1.getNo());
	}

}

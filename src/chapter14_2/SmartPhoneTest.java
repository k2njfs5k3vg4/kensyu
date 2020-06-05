package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartPhoneTest extends SmartPhone {

	@Test
	void test() {
		SmartPhone sp = new SmartPhone("111", "aaa");
		Assertions.assertEquals("スマートフォンでデータをアップロードしました。", sp.upload());
		Assertions.assertEquals("スマートフォンでデータをダウンロードしました。", sp.download());

	}

	@Test
	void test2() {
		SmartPhone sp = new SmartPhone("111", "aaa");
		Assertions.assertEquals("スマートフォンで音楽を再生しました。", sp.play());
		Assertions.assertEquals("スマートフォンで音楽を停止しました。", sp.stop());

	}

}

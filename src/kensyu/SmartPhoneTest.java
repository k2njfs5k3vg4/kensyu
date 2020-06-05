package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SmartPhoneTest extends SmartPhone {

	@Test
	@DisplayName("uploadの確認")
	void test1() {
		SmartPhone s = new SmartPhone();
		Assertions.assertEquals("スマホでデータをアップロード", s.upload());
	}

	@Test
	@DisplayName("downloadの確認")
	void test2() {
		SmartPhone s = new SmartPhone();
		Assertions.assertEquals("スマホでデータをダウンロード", s.download());
	}

	@Test
	@DisplayName("playの確認")
	void test3() {
		SmartPhone s = new SmartPhone();
		Assertions.assertEquals("スマホで音楽を再生", s.play());
	}

	@Test
	@DisplayName("stopの確認")
	void test4() {
		SmartPhone s = new SmartPhone();
		Assertions.assertEquals("スマホで音楽を停止", s.stop());
	}

	@Test
	@DisplayName("電話の確認")
	void test5() {
		SmartPhone s = new SmartPhone("090-1234-5555", "zzz@abc.com");
		Assertions.assertEquals("090-1234-5555から080-8888-9999へ電話しました。", s.tel("080-8888-9999"));
	}

	@Test
	@DisplayName("メールの確認")
	void test6() {
		SmartPhone s = new SmartPhone("090-1234-5555", "zzz@abc.com");
		Assertions.assertEquals("zzz@abc.comからddd@fff.comへメールしました。", s.mail("ddd@fff.com"));
	}

}

package kensyu2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HandyPhone4Test extends HandyPhone4 {

	@Test
	@DisplayName("mailAddressの取得")
	void test() {
		//fail("まだ実装されていません");
		HandyPhone4 hp = new HandyPhone4();
		Assertions.assertEquals(null, hp.getMailAddress());

	}

	@Test
	@DisplayName("mailAddressの設定")
	void test2() {
		//fail("まだ実装されていません");
		HandyPhone4 hp = new HandyPhone4();
		hp.setMailAddress("abc@gamil.com");
		Assertions.assertEquals("abc@gamil.com", hp.getMailAddress());

	}

	@Test
	@DisplayName("mail送信")
	void test3() {
		//fail("まだ実装されていません");
		HandyPhone4 hp = new HandyPhone4();
		hp.setMailAddress("abc@gamil.com");
		Assertions.assertEquals("abc@gamil.comからabc@yahoo.co.jpへメールしました。", hp.mail("abc@yahoo.co.jp"));

	}

	@Test
	@DisplayName("info")
	void test4() {
		//fail("まだ実装されていません");
		HandyPhone4 hp = new HandyPhone4();
		hp.setMailAddress("abc@gamil.com");
		hp.setNo("080-1111-2222");
		Assertions.assertEquals("電話番号=080-1111-2222 メールアドレス=abc@gamil.com", hp.info());

	}

	@Test
	@DisplayName("コンストラクタを確認")
	void test5() {
		//fail("まだ実装されていません");
		HandyPhone4 hp = new HandyPhone4("090-2222-4444", "aaaaa@gmail.com");
		Assertions.assertEquals("電話番号=090-2222-4444 メールアドレス=aaaaa@gmail.com", hp.info());

	}

}

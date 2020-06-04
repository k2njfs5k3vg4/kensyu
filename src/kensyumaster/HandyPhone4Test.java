package kensyumaster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HandyPhone4Test extends HandyPhone4 {

	@Test
	@DisplayName("セッターとゲッターでアドレス取得の確認")
	void test() {
		HandyPhone4 handyphone = new HandyPhone4();
		handyphone.setMailAddress("hogehoge");
		Assertions.assertEquals("hogehoge", handyphone.getMailAddress());
	}

	@Test
	@DisplayName("Phone4クラス継承の確認")
	void test2() {
		HandyPhone4 handyphone = new HandyPhone4();
		handyphone.setNo("hogehoge");
		Assertions.assertEquals("hogehoge", handyphone.getNo());
	}

	@Test
	@DisplayName("mailで出力の確認")
	void test3() {
		HandyPhone4 handyphone = new HandyPhone4();
		handyphone.setMailAddress("hogehoge");
		Assertions.assertEquals("hogehogeから武井へメールしました。", handyphone.mail("武井"));
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void test4() {
		HandyPhone4 handyphone = new HandyPhone4("武井","hogehoge");
		Assertions.assertEquals("hogehogeから武井へメールしました。", handyphone.mail("武井"));
	}

	@Test
	@DisplayName("infoで情報出力の確認")
	void test5() {
		HandyPhone4 handyphone = new HandyPhone4("0120114514","hogehoge");
		Assertions.assertEquals("電話番号=0120114514, メールアドレス=hogehoge",
				handyphone.info());
	}


}

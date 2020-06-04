package kensyumaster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Phone4Test extends Phone4 {

	@Test
	@DisplayName("電話番号がsetメソッドで設定できるか確認")
	void test1() {
		Phone4 phone = new Phone4();
		phone.setNo("0120117117");
		Assertions.assertEquals("0120117117", phone.getNo());
	}

	@Test
	@DisplayName("電話番号がコンストラクタで設定できるかの確認")
	void test2() {
		Phone4 phone = new Phone4("0120117117");
		Assertions.assertEquals("0120117117", phone.getNo());
	}

	@Test
	@DisplayName("電話履歴を送信できるかの確認")
	void test3() {
		Phone4 phone = new Phone4("0120117117");
		Assertions.assertEquals("0120117117から河村へ電話しました。", phone.getTelInfo("河村"));
	}

}

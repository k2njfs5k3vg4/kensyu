package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class kakunin10_3_2Test extends kakunin10_3_2 {

	@Test
	@DisplayName("4つ引数を受け取ってSQL文の実行をするメソッド")
	void test1() {
		kakunin10_3_2 k = new kakunin10_3_2();
		Assertions.assertEquals("8:近藤:40: 080-9999-7777", k.executeSQL(8, "近藤", 40, "080-9999-7777"));

	}



}

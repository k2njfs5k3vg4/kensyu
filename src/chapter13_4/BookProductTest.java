package chapter13_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookProductTest extends BookProduct {

	@Test
	void test() {
		BookProduct bp = new BookProduct();
		bp.price = 100;
		bp.title = "aaa";
		bp.syuppan = "bbb";
		Assertions.assertEquals("タイトル：aaa 出版社：bbb 価格：100", bp.showBook());

	}

}

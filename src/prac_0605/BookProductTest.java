package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookProductTest extends BookProduct {

	@Test
	void test() {
		//		fail("まだ実装されていません");

		BookProduct b = new BookProduct();
		b.price = 1400;
		b.title = "刑事コロンボ";
		b.publisher = "ABC";

		Assertions.assertEquals(1400 + "刑事コロンボ" + "ABC", b.showBook());
	}

}

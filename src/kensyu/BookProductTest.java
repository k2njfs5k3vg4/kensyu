package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BookProductTest extends BookProduct {

	@Test
	@DisplayName("継承の確認")
	void test() {
		BookProduct bp = new BookProduct();
		bp.price=1000;
		Assertions.assertEquals("価格：1000円", bp.showPrice());
	}

	@Test
	@DisplayName("showbookで情報表示の確認")
	void test1() {
		BookProduct bp = new BookProduct();
		bp.price=1000;
		bp.title="hoge";
		bp.publisher="ahoy";

		Assertions.assertEquals("タイトル：hoge, 出版社：ahoy, 価格：1000円", bp.showBook());
	}



}

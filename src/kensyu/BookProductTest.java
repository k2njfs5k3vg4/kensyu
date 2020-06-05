package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookProductTest extends BookProduct {

	//	@Test
	//	void test() {
	//		BookProduct b1 = new BookProduct();
	//		b1.title = "a";
	//		b1.publisher = "b";
	//
	//		Assertions.assertEquals("a", b1.title);
	//		Assertions.assertEquals("b", b1.publisher);
	//
	//	}

	@Test
	void test() {
		BookProduct b1 = new BookProduct();
		b1.setTitle("a");
		b1.setPublisher("b");
		b1.setPrice(1);

		Assertions.assertEquals("a", b1.getTitle());
		Assertions.assertEquals("b", b1.getPublisher());
		Assertions.assertEquals(1, b1.getPrice());

	}

	@Test
	void test2() {
		BookProduct b1 = new BookProduct();
		b1.setTitle("a");
		b1.setPublisher("b");
		b1.setPrice(1);

		Assertions.assertEquals("a b 1", b1.showBook());

	}

}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest extends Product {

	//	@Test
	//	void test() {
	//		Product p1 = new Product();
	//		p1.price = 0;
	//		Assertions.assertEquals(0, p1.price);
	//	}

	@Test
	void test() {
		Product p1 = new Product();
		p1.setPrice(0);
		Assertions.assertEquals(0, p1.getPrice());
	}

	@Test
	void test2() {
		Product p1 = new Product();
		p1.setPrice(0);
		Assertions.assertEquals("価格:0円", p1.showPrice());
	}

}

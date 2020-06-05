package chapter13_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest extends Product {

	@Test
	void test1() {
		Product p = new Product();
		p.price = 100;
		Assertions.assertEquals(100, p.price);

	}

	@Test
	void test2() {
		Product p = new Product();
		p.price = 100;
		Assertions.assertEquals("価格：100円", p.showPrice());

	}

}

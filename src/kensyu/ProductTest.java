package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest extends Product {

	@Test
	void test() {
		Product product = new Product();
		product.price = 1000;
		Assertions.assertEquals(1000, product.price);
	}

}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest extends Product {

	@Test
	void test() {
		Product pr = new Product();
		pr.price = 1400;
		Assertions.assertEquals(1400, pr.price);
	}

	@Test
	void test1() {
		Product pr = new Product();
		pr.price = 1400;
		Assertions.assertEquals(1400, pr.getprice());
	}

}

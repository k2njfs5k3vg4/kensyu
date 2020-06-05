package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest extends Product {

	@Test
	void test() {
		//		fail("まだ実装されていません");
		Product p = new Product();
		p.price = 1400;
		Assertions.assertEquals(1400, p.showPrice());
	}

}

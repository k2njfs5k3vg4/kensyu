package murano_kima.kima;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PhoneTest extends Phone {

	@Test
	void test() {
		Phone p1 = new Phone();
		p1.no = "55555";
		Assertions.assertEquals("55555", p1.no);
	}

	@Test
	void test2() {
		Phone p1 = new Phone();
		p1.no = "55555";
		Assertions.assertEquals("55555", p1.getTel());
	}

}

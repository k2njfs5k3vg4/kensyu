package Simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Phone4Test extends Phone4 {

	//	@Test
	//	void test() {
	//		Phone4 ph4 = new Phone4();
	//		ph4.no = "55555";
	//		Assertions.assertEquals("55555", ph4.no);
	//	}

	@Test
	void test2() {
		Phone4 ph4 = new Phone4();
		ph4.setNo("55555");
		Assertions.assertEquals("55555", ph4.getNo());
	}

	@Test
	void test3() {
		Phone4 ph4 = new Phone4("55555");
		Assertions.assertEquals("55555", ph4.getNo());
	}

}

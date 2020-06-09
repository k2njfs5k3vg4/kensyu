package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Circle4Test extends Circle4 {

	@Test
	@DisplayName("setter、getter、PIのテスト")
	void test1() {
		Circle4 c = new Circle4();
		try {
			c.setRadius(2.0);
		} catch (CircleRadiusException e) {
		}
		Assertions.assertEquals(2.0, c.getRadius());
		Assertions.assertEquals(3.14, Circle4.PI);

	}

	@Test
	@DisplayName("引数ありコンストラクタのテスト")
	void test2() {
		Circle4 c;
		try {
			c = new Circle4(2.0);
			Assertions.assertEquals(2.0, c.getRadius());

		} catch (Exception e) {
			fail();
		}

	}

	@Test
	void test3() {
		Circle4 c;
		try {
			c = new Circle4(2.0);
			Assertions.assertEquals(12.56, c.area());

		} catch (Exception e) {
			fail();

		}

	}

	@Test
	void test4() {
		Circle4 c;
		try {
			c = new Circle4(0.0);

		} catch (Exception e) {
			return;

		}
		fail();

	}

	@Test
	void test5() {
		Circle4 c;
		try {
			c = new Circle4(-0.1);

		} catch (Exception e) {
			return;

		}
		fail();

	}

}

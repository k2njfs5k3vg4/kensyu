package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circle4Test extends Circle4 {

	//	@Test
	//	void test() {
	//		Circle4 cr = new Circle4();
	//		cr.radius = 1.5;
	//		Assertions.assertEquals(1.5, cr.getRadius());
	//	}

	@Test
	void test1() {
		Circle4 cr;
		try {
			cr = new Circle4(1.5);
		} catch (InvalidRadius e) {
			// TODO 自動生成された catch ブロック
			fail();
			//			e.printStackTrace();
		}
		return;
		//		Assertions.assertEquals(1.5, cr.getRadius());
	}

	@Test
	void test2() {
		Circle4 cr;
		try {
			cr = new Circle4(-1.5);
		} catch (InvalidRadius e) {
			// TODO 自動生成された catch ブロック
			//			e.printStackTrace();
		}
		//		Assertions.assertEquals(7.065, cr.area());
	}

	@Test
	void test3() {
		Circle4 cr;
		try {
			cr = new Circle4(0);
		} catch (InvalidRadius e) {
			// TODO 自動生成された catch ブロック
			return;
			//			e.printStackTrace();
		}
		//		Assertions.assertEquals(7.065, cr.area());
	}

}

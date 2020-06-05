package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TruckTest extends Truck {

	@Test
	void test1() {
		Truck t = new Truck();
		Assertions.assertEquals("ガソリンで動く", t.accel());
	}

	@Test
	void test2() {
		Truck t = new Truck();
		Assertions.assertEquals("カーステレオを再生します", t.play());
	}

	@Test
	void test3() {
		Truck t = new Truck();
		Assertions.assertEquals("カーステレオを停止します", t.stop());
	}

	@Test
	void test4() {
		Truck t = new Truck();
		Assertions.assertEquals("トラックで荷物を運びます", t.carry());
	}

}

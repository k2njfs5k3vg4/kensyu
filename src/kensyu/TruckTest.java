package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TruckTest extends Truck {

	@Test
	void test() {
		Truck t = new Truck();

		Assertions.assertEquals("ガソリン", t.accel());
		Assertions.assertEquals("カーステレオを再生", t.play());
		Assertions.assertEquals("カーステレオを停止", t.stop());
		Assertions.assertEquals("トラックで運ぶ", t.carry());
	}

}

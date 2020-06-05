package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TruckTest extends Truck {

	@Test
	void test() {
		Truck tr1 = new Truck();
		Assertions.assertEquals("カーステレオを再生します。", tr1.play());
		Assertions.assertEquals("カーステレオを停止します。", tr1.stop());
		Assertions.assertEquals("トラックで荷物を運びます。", tr1.carry());
	}

}

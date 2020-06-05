package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TruckTest extends Truck {

	@Test
	@DisplayName("Playの実行確認")
	void test1() {
		Truck t = new Truck();
		Assertions.assertEquals("カーステレオを再生", t.play());
	}

	@Test
	@DisplayName("Stopの実行確認")
	void test2() {
		Truck t = new Truck();
		Assertions.assertEquals("カーステレオを停止", t.stop());
	}

	@Test
	@DisplayName("Carryの実行確認")
	void test3() {
		Truck t = new Truck();
		Assertions.assertEquals("トラックで荷物を運ぶ", t.carry());
	}

	@Test
	@DisplayName("Accelの実行確認")
	void test4() {
		Truck t = new Truck();
		Assertions.assertEquals("ガソリンで動く", t.accel());
	}

}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StereoTest extends Stereo {

	@Test
	void test() {
		Stereo st1 = new Stereo();
		Assertions.assertEquals("ステレオを再生します", st1.play());
		Assertions.assertEquals("ステレオを停止します", st1.stop());
	}

}

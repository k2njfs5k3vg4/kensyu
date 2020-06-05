package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StereoTest extends Stereo {

	@Test
	void test() {
		Stereo s = new Stereo();
		Assertions.assertEquals("ステレオを再生します。", s.play());
		Assertions.assertEquals("ステレオを停止します。", s.stop());

	}

}

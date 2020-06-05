package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StereoTest extends Stereo {

	@Test
	@DisplayName("再生")
	void test1() {
		//fail("まだ実装されていません");
		Stereo s = new Stereo();
		Assertions.assertEquals("ステレオを再生します", s.play());
	}

	@Test
	@DisplayName("停止")
	void test2() {
		//fail("まだ実装されていません");
		Stereo s = new Stereo();
		Assertions.assertEquals("ステレオを停止します", s.stop());
	}

}

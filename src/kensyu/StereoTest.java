package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StereoTest extends Stereo {

	@Test
	@DisplayName("playの出力確認")
	void test() {
		Stereo stereo = new Stereo();
		Assertions.assertEquals("ステレオを再生します。", stereo.play());
	}

	@Test
	@DisplayName("stopの出力確認")
	void test1() {
		Stereo stereo = new Stereo();
		Assertions.assertEquals("ステレオを停止します。", stereo.stop());
	}

}

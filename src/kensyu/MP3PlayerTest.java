package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MP3PlayerTest extends MP3Player {

	@Test
	@DisplayName("playの確認")
	void tes1() {
		MP3Player w = new MP3Player();
		Assertions.assertEquals("MP3を再生します。", w.play());
	}

	@Test
	@DisplayName("playの確認")
	void test2() {
		MP3Player w = new MP3Player();
		Assertions.assertEquals("MP3を停止します。", w.stop());
	}

}

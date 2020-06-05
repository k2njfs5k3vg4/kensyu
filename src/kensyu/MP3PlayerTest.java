package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MP3PlayerTest extends MP3Player {

	@Test
	@DisplayName("play,stopメソッドの出力確認")
	void test() {
		MP3Player mp3p = new MP3Player();
		Assertions.assertEquals("MP3を再生します。", mp3p.play());
		Assertions.assertEquals("MP3を停止します。", mp3p.stop());
	}

}

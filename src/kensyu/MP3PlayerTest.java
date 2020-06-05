package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MP3PlayerTest extends MP3Player {

	@Test
	void test() {
		//Audio s = new MP3Player();
		MP3Player s = new MP3Player();
		Assertions.assertEquals("MP3を再生します。", s.play());
		Assertions.assertEquals("MP3を停止します。", s.stop());
	}

}

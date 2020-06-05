package chapter14_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MP3PlayerTest extends MP3Player {

	@Test
	void test() {
		MP3Player m = new MP3Player();
		Assertions.assertEquals("MP3を再生します。", m.play());
		Assertions.assertEquals("MP3を停止します。", m.stop());

	}

}

package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MP3PlayerTest extends MP3Player {

	@Test
	@DisplayName("再生")
	void test1() {
		//fail("まだ実装されていません");
		MP3Player mp = new MP3Player();
		Assertions.assertEquals("MP3を再生します", mp.play());
	}

	@Test
	@DisplayName("停止")
	void test2() {
		//fail("まだ実装されていません");
		MP3Player mp = new MP3Player();
		Assertions.assertEquals("MP3を停止します", mp.stop());
	}

}

package la.servlet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_2Test {

	@Test
	void test() {
		Lesson10_2 l = new Lesson10_2(10, "Eric", 49, "0975-22-7777");
		Assertions.assertEquals("1件、データベースに追加しました。", l.insert());
	}

}

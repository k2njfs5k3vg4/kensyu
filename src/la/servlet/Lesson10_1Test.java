package la.servlet;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_1Test extends Lesson10_1 {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Lesson10_1 l10 = new Lesson10_1();
		ArrayList<String> rs = l10.get();
		Assertions.assertEquals("2 : 佐藤 : 28 : 043-2222-2222", rs.get(0));
		Assertions.assertEquals("8 : 近藤 : 29 : 09-999-9999", rs.get(1));
		Assertions.assertEquals("1 : 鈴木 : 30 : 03-1111-1111", rs.get(2));
		Assertions.assertEquals("5 : 木村 : 31 : 076-5555-5555", rs.get(3));
		Assertions.assertEquals("3 : 田中 : 46 : 05-3333-3333", rs.get(4));
		Assertions.assertEquals("4 : 山田 : 57 : 076-4444-4444", rs.get(5));
	}

}

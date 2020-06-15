import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_3Test {

	@Test
	void test() {
		//fail("まだ実装されていません");
		Lesson10_3 l10 = new Lesson10_3("木");
		Assertions.assertEquals("木", l10.getKey());
	}

	@Test
	void test2() {
		Lesson10_3 l10 = new Lesson10_3("木");
		Assertions.assertEquals("SELECT * FROM emp WHERE name LIKE '%木%'", l10.sql());
	}

	@Test
	void test3() {
		Lesson10_3 l10 = new Lesson10_3("木");
		ArrayList<String> rs = l10.search();
		Assertions.assertEquals("1 : 鈴木 : 30 : 03-1111-1111", rs.get(0));
		Assertions.assertEquals("5 : 木村 : 31 : 076-5555-5555", rs.get(1));

	}

}

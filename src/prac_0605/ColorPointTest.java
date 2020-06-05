package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColorPointTest extends ColorPoint {

	/*@Test
	@DisplayName("色設定")
	void test1() {
		//fail("まだ実装されていません");
		ColorPoint cp = new ColorPoint();
		cp.color = "red";
		Assertions.assertEquals("red", cp.getColor());
	}*/

	@Test
	@DisplayName("コンストラクタ")
	void test2() {
		//fail("まだ実装されていません");
		ColorPoint cp = new ColorPoint(15, 20, "red");

		Assertions.assertEquals("15,20,red", cp.getPoint());
	}

	@Test
	@DisplayName("list")
	void test3() {
		//fail("まだ実装されていません");
		Point[] p = { new Point(3, 9), new ColorPoint(12, -3, "Red"), new Point(56, 2),
				new ColorPoint(7, -28, "Blue") };

		Assertions.assertEquals("3,9", p[0].getPoint());
		Assertions.assertEquals("12,-3,Red", p[1].getPoint());
		Assertions.assertEquals("56,2", p[2].getPoint());
		Assertions.assertEquals("7,-28,Blue", p[3].getPoint());
	}

}

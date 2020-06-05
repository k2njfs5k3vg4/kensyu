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

		Assertions.assertEquals("15,20,red", cp.getColorPoint());
	}

}

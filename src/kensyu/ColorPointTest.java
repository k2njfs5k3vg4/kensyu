package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColorPointTest extends ColorPoint {

	@Test
	@DisplayName("色情報をとってくる")
	void test1() {
		ColorPoint cp = new ColorPoint();
		Assertions.assertEquals(null, cp.getColor());
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void test2() {
		ColorPoint cp = new ColorPoint(1,2,"Red");
		Assertions.assertEquals(1, cp.getX());
		Assertions.assertEquals(2, cp.getY());
		Assertions.assertEquals("Red", cp.getColor());
	}

	@Test
	@DisplayName("出力メソッドの確認")
	void test3() {
		ColorPoint cp = new ColorPoint(1,2,"Red");
		Assertions.assertEquals("x:1 y:2\ncolor:Red", cp.showInfo());
	}



}

package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest extends Point {

	@Test
	@DisplayName("xが取得できるか")
	void tes1() {
		Point p = new Point();
		Assertions.assertEquals(0,p.getX());
	}

	@Test
	@DisplayName("yが取得できるか")
	void tes2() {
		Point p = new Point();
		Assertions.assertEquals(0,p.getY());
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void tes3() {
		Point p = new Point(1,2);
		Assertions.assertEquals(1, p.getX());
		Assertions.assertEquals(2, p.getY());
	}

	@Test
	@DisplayName("座標の情報を画面に出力")
	void tes4() {
		Point p = new Point(1,2);
		Assertions.assertEquals("x:1 y:2", p.showXY());
	}

}

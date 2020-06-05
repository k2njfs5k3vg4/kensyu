package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ColorPointTest extends ColorPoint {

	@Test
	@DisplayName("x座標、y座標、色を引数に取るコンストラクタによるオブジェクト生成の確認")
	void tes1t() {
		ColorPoint cp = new ColorPoint(100, 200, "red");
		Assertions.assertEquals(cp.getX(), 100);
		Assertions.assertEquals(cp.getY(), 200);
		Assertions.assertEquals(cp.getColor(), "red");
	}

	@Test
	@DisplayName("色情報と座標情報を出力するメソッドの出力確認")
	void test2() {
		ColorPoint cp = new ColorPoint(100, 200, "red");
		Assertions.assertEquals(cp.getPointInfo(), "x：100 y：200\ncolor：red");
	}
}

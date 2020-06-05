package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest extends Point {

	@Test
	@DisplayName("x座標、y座標を引数に取るコンストラクタによるオブジェクト生成の確認")
	void test0() {
		Point point = new Point(100, 200);
		Assertions.assertEquals(point.getX(), 100);
		Assertions.assertEquals(point.getY(), 200);
	}

	@Test
	@DisplayName("座標情報を出力するメソッドの出力確認")
	void test1() {
		Point point = new Point(100, 200);
		Assertions.assertEquals(point.getPointInfo(), "x：100 y：200");
	}

}

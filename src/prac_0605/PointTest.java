package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest extends Point {

	@Test
	@DisplayName("fieldの設定")
	void test() {
		//fail("まだ実装されていません");
		Point p = new Point();
		p.setX(15);
		p.setY(20);
		Assertions.assertEquals("15,20", p.getPoint());
	}

	@Test
	@DisplayName("コンストラクタの設定")
	void test2() {
		//fail("まだ実装されていません");
		Point p = new Point(15, 20);

		Assertions.assertEquals("15,20", p.getPoint());
	}

}

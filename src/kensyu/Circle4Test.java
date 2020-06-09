package kensyu;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Circle4Test {

	@Test
	@DisplayName("半径を引数にしたコンストラクタの動作確認")
	void test() {
		try {
			Circle4 c4 = new Circle4(5);
			Assertions.assertEquals(c4.getRadius(), 5);
		} catch (InvalidSizeException e) {
			fail();
		}
	}

	@Test
	@DisplayName("円の面積を取得できるか確認")
	void test1() {
		try {
			Circle4 c4 = new Circle4(5);
			Assertions.assertEquals(c4.area(), 75);
		} catch (InvalidSizeException e) {
			fail();
		}
	}

	@Test
	@DisplayName("引数が0以下の場合の例外処理の動作確認")
	void test2() {
		try {
			Circle4 c4 = new Circle4(0);
			Assertions.assertEquals(c4.area(), 75);
		} catch (InvalidSizeException e) {
			return;
		}
		fail();
	}
}

package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Circle4Test extends Circle4 {

	@Test
	@DisplayName("0以下入力時のエラー確認")
	void test() {
		try {
			Circle4 c = new Circle4(0);
		}catch(CalcException e){
			return;
		}fail();
	}

	@Test
	@DisplayName("0より大きい時の正常動作確認")
	void test1() {
		try {
			Circle4 c = new Circle4(1);
		}catch(CalcException e){
			fail();
		}
	}

	@Test
	@DisplayName("area()の出力確認")
	void test2() {
		Circle4 c;
		try {
			c = new Circle4(1);
			Assertions.assertEquals(3.14, c.area());
		} catch (CalcException e) {
			fail();
		}
	}


}

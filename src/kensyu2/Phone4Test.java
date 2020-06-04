package kensyu2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Phone4Test extends Phone4 {

	@Test
	@DisplayName("電話番号を取得できるか")
	void test1() {
		Phone4 p = new Phone4();
		Assertions.assertEquals(null, p.getNo());
	}

	@Test
	@DisplayName("電話番号を設定できるか")
	void test2() {
		Phone4 p = new Phone4();
		p.setNo("090-1111-2222");
		Assertions.assertEquals("090-1111-2222", p.getNo());
	}

	@Test
	@DisplayName("telできるか")
	void test3() {
		Phone4 p = new Phone4();
		p.setNo("090-1111-2222");
		Assertions.assertEquals("090-1111-2222から080-5555-6666へ電話しました。", p.tel("080-5555-6666"));
	}

	@Test
	@DisplayName("str引数を与えたときのコンストラクタの確認")
	void test4() {
		Phone4 p = new Phone4("090-1111-2222");
		Assertions.assertEquals("090-1111-2222", p.getNo());
	}



}

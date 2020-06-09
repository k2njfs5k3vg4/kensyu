package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	@DisplayName("名前を取得できるか")
	void test1() {
		Person3 p = new Person3();
		Assertions.assertEquals(null, p.getName());
	}

	@Test
	@DisplayName("名前を設定できるか")
	void test2() {
		Person3 p = new Person3();
		p.setName("Bob");
		Assertions.assertEquals("Bob", p.getName());
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void test3() {
		Person3 p = new Person3("Bob");
		Assertions.assertEquals("Bob", p.getName());
	}

	@Test
	@DisplayName("自己紹介関数の確認")
	void test4() {
		Person3 p = new Person3("Bob");
		Assertions.assertEquals( "私はBobと申します。", p.introduce());
	}


}

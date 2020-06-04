package kensyumaster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	@DisplayName("コンストラクタの確認")
	void test() {
		Person3 person = new Person3("name");
		Assertions.assertEquals("name", person.getName());
	}

	@Test
	@DisplayName("ゲッターとセッターの確認")
	void test1() {
		Person3 person = new Person3();
		person.setName("name");
		Assertions.assertEquals("name", person.getName());
	}

	@Test
	@DisplayName("introduceの出力確認")
	void test2() {
		Person3 person = new Person3();
		person.setName("武井");
		Assertions.assertEquals("私は武井と申します。", person.introduce());
	}

}

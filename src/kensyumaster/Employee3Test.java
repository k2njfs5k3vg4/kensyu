package kensyumaster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Employee3Test extends Employee3 {

	@Test
	@DisplayName("Person3クラスの継承ができているかの確認")
	void test() {
		Employee3 employ = new Employee3();
		Assertions.assertEquals(null, employ.getName());
	}

	@Test
	@DisplayName("departmentのセッター、ゲッターの確認")
	void test1() {
		Employee3 employ = new Employee3();
		employ.setDepartment("営業部");
		Assertions.assertEquals("営業部", employ.getDepartment());
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void test2() {
		Employee3 employ = new Employee3("ジョン・スミス", "営業部");
		Assertions.assertEquals("ジョン・スミス", employ.getName());
	}

	@Test
	@DisplayName("introduceメソッドの返り値の確認")
	void test3() {
		Employee3 employ = new Employee3("ジョン・スミス", "営業部");
		Assertions.assertEquals("私はジョン・スミスと申します。\n所属は営業部です。", employ.introduce());
	}

}

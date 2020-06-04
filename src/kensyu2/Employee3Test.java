package kensyu2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Employee3Test extends Employee3 {

	@Test
	@DisplayName("所属の取得確認")
	void test1() {
		Employee3 e = new Employee3();
		Assertions.assertEquals(null,e.getDepartment());
	}

	@Test
	@DisplayName("所属の設定確認")
	void test2() {
		Employee3 e = new Employee3();
		e.setDepartment("営業部");
		Assertions.assertEquals("営業部",e.getDepartment());
	}

	@Test
	@DisplayName("コンストラクタの確認")
	void test3() {
		Employee3 e = new Employee3("ジョニー","営業部");
		Assertions.assertEquals("ジョニー",e.getName());
		Assertions.assertEquals("営業部",e.getDepartment());
	}

	@Test
	@DisplayName("自己紹介する")
	void test4() {
		Employee3 e = new Employee3("ジョニー","営業部");
		Assertions.assertEquals( "私はジョニーと申します。\n所属は営業部です。",e.introduce());
	}



}

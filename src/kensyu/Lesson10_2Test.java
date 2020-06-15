package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Lesson10_2Test {

	@Test
	@DisplayName("セッター、ゲッターの実装")
	void test1() {
		Lesson10_2 db = new Lesson10_2("student", "himitu");
		db.setCode(10);
		db.setName("Eric");
		db.setAge(49);
		db.setTel("0975-22-7777");
		Assertions.assertEquals("10：Eric：49：0975-22-7777", db.getInsertValues());
	}

	//	@Test
	//	@DisplayName("インサートメソッドの実装")
	//	void test2() {
	//		Lesson10_2 db = new Lesson10_2("student", "himitu");
	//		db.setCode(10);
	//		db.setName("Eric");
	//		db.setAge(49);
	//		db.setTel("0975-22-7777");
	//		Assertions.assertEquals("1件挿入しました。", db.insert());
	//	}

	@Test
	@DisplayName("インサートメソッドの処理結果の確認")
	void test3() {
		Lesson10_2 db = new Lesson10_2("student", "himitu");
		Assertions.assertEquals("10：Eric：49：0975-22-7777", db.getLastRow());
	}
}

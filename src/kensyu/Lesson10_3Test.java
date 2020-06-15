package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Lesson10_3Test {

	@Test
	@DisplayName("コンストラクタの実装")
	void test1() {
		Lesson10_3 db = new Lesson10_3("student", "himitu");
		Assertions.assertEquals("student", db.getUser());
		Assertions.assertEquals("himitu", db.getPass());
	}

	//	@Test
	//	@DisplayName("fuzzySearchメソッドの戻り値の実装")
	//	void test2() {
	//		Lesson10_3 db = new Lesson10_3("student", "himitu");
	//
	//		Assertions.assertEquals("木", db.fuzzySerch("木").get(0));
	//	}

	//	@Test
	//	@DisplayName("fuzzySearchメソッドでのデータベースへのアクセスの実装")
	//	void test3() {
	//		try {
	//			Lesson10_3 db = new Lesson10_3("student", "himitu");
	//			Assertions.assertEquals("木", db.fuzzySerch("木").get(0));
	//		} catch (SQLException e) {
	//			fail();
	//		} //st.toString;
	//	}

	//	@Test
	//	@DisplayName("fuzzySearchメソッドでSQL文が格納されているかどうかの確認")
	//	void test4() {
	//		try {
	//			Lesson10_3 db = new Lesson10_3("student", "himitu");
	//			Assertions.assertEquals("SELECT * FROM emp WHERE name LIKE '?'", db.fuzzySerch("木").get(0));
	//		} catch (SQLException e) {
	//			fail();
	//		} //st.toString;
	//	}

	//	@Test
	//	@DisplayName("fuzzySearchメソッドでSQL文の?に'木'が格納されているかどうかの確認")
	//	void test5() {
	//		try {
	//			Lesson10_3 db = new Lesson10_3("student", "himitu");
	//			Assertions.assertEquals("SELECT * FROM emp WHERE name LIKE '木'", db.fuzzySerch("木").get(0));
	//		} catch (SQLException e) {
	//			e.printStackTrace();
	//			fail();
	//		} //st.toString;
	//	}

	@Test
	@DisplayName("fuzzySearchメソッドによるあいまい検索結果の確認")
	void test6() {
		try {
			Lesson10_3 db = new Lesson10_3("student", "himitu");
			String[] ans = { "1：鈴木：30：03-1111-1111", "5：木村：31：076-5555-5555" };
			ArrayList<String> result = db.fuzzySerch("木");
			Assertions.assertEquals(2, result.size());
			for (int i = 0; i < result.size(); i++) {
				Assertions.assertEquals(ans[i], result.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			fail();
		} //st.toString;
	}

}

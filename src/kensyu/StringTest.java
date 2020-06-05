package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("文字数の確認")
	void test() {
		String test = "this is a test";
		Assertions.assertEquals(14, test.length());
	}

	@Test
	@DisplayName("文字の取り出し")
	void test1() {
		String test = "this is a test";
		Assertions.assertEquals('s', test.charAt(3));
	}

	@Test
	@DisplayName("文字列の切り出し")
	void test2() {
		String test = "this is a test";
		Assertions.assertEquals("test", test.substring(10));
		Assertions.assertEquals("this", test.substring(0,4));
	}

	@Test
	@DisplayName("文字列の検索")
	void test3() {
		String test = "abcabcabcabcdefabc";
		Assertions.assertEquals(12, test.indexOf("def"));
		Assertions.assertEquals(15, test.lastIndexOf("abc"));
	}

	@Test
	@DisplayName("文字列の検索")
	void test4() {
		String test = "abcabcabcdef";
		Assertions.assertEquals(9, test.indexOf("def"));
		Assertions.assertEquals(6, test.lastIndexOf("abc"));
	}

	@Test
	@DisplayName("文字列の変換")
	void test5() {
		String test = "AbCdEf";
		Assertions.assertEquals("ABCDEF", test.toUpperCase());
		Assertions.assertEquals("abcdef",test.toLowerCase());
	}

	@Test
	@DisplayName("文字列の比較")
	void test6() {
		String test = "AbCdEf";
		String test1 = "AbCdEf";
		Assertions.assertEquals(true,test.equals(test1));
	}


}

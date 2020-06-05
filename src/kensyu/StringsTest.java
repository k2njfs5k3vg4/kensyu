package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringsTest extends Strings {
	String s1 = "This is a Murano";
	String s2 = "abcabcabcabcdefab";

	@Test
	void test() {
		Assertions.assertEquals(s1.length(), 16);
	}

	@Test
	void test1() {
		Assertions.assertEquals(s1.charAt(4), ' ');
	}

	@Test
	void test2() {
		Assertions.assertEquals(s1.substring(3, 9), "s is a");
	}

	@Test
	void test3() {
		Assertions.assertEquals(s1.indexOf("Murano"), 10);
	}

	@Test
	void test4() {
		Assertions.assertEquals(s2.lastIndexOf("abc"), 9);
	}

}

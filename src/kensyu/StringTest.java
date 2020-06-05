package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String s1 = "This is a sample";
		String s2 = "This is a sample";
		//String s2 = "This is a sample";

		Assertions.assertEquals(16, s1.length());
		Assertions.assertEquals('s', s1.charAt(3));
		Assertions.assertEquals("s is a", s1.substring(3, 9));
		Assertions.assertEquals(2, s1.indexOf("is"));
		Assertions.assertEquals(5, s1.lastIndexOf("is"));
		Assertions.assertEquals("THIS IS A SAMPLE", s1.toUpperCase());
		Assertions.assertEquals("this is a sample", s1.toLowerCase());

		Assertions.assertTrue(s2.equals(s1));

	}

}

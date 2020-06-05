package chapter15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		String s1 = "This is a sample";
		Assertions.assertEquals(16, s1.length());
		Assertions.assertEquals('s', s1.charAt(3));
		Assertions.assertEquals("This", s1.substring(0, 4));
		Assertions.assertEquals(2, s1.indexOf("is"));
		Assertions.assertEquals(5, s1.lastIndexOf("is"));
		Assertions.assertEquals("THIS IS A SAMPLE", s1.toUpperCase());
		Assertions.assertEquals("this is a sample", s1.toLowerCase());

		String s2 = "This is a pen";
		Assertions.assertEquals(false, s1.equals(s2));

	}

}

package prac_0605;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void test() {
		//		fail("まだ実装されていません");

		String s1 = "This is a sample";
		char s = 'h';
		String s2 = "his is a";
		Assertions.assertEquals(s, s1.charAt(1));
		Assertions.assertEquals(s2, s1.substring(1, 9));
		Assertions.assertEquals(8, s1.indexOf("a"));
		Assertions.assertEquals(11, s1.lastIndexOf("a"));
	}

	@Test
	void test2() {
		//		fail("まだ実装されていません");

		String s1 = "AdCPf";
		//		char s = 'h';
		String s2 = "ADCPF";
		String s3 = "adcpf";
		Assertions.assertEquals(s2, s1.toUpperCase());
		Assertions.assertEquals(s3, s1.toLowerCase());
		//		Assertions.assertEquals(s2, s1.substring(1, 9));
		//		Assertions.assertEquals(8, s1.indexOf("a"));
		//		Assertions.assertEquals(11, s1.lastIndexOf("a"));
	}

	@Test
	void test3() {
		String s4 = new String("abc");
		String s5 = new String("abc");

		Assertions.assertTrue(s4.equals(s5));

	}
}

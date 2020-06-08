package kensyu;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day10Test {

	@Test
	void test() {
		try {
			Day10 d = new Day10(2020, 6, 8);
			Assertions.assertEquals("2020年6月8日", d.toString());
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test1() {
		try {
			Day10 d = new Day10(0, 10, 10);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test2() {
		try {
			Day10 d = new Day10(3001, 10, 10);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test3() {
		try {
			Day10 d = new Day10(1, 10, 10);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test4() {
		try {
			Day10 d = new Day10(3000, 10, 10);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test5() {
		try {
			Day10 d = new Day10(1000, 0, 10);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test6() {
		try {
			Day10 d = new Day10(1000, 13, 10);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test7() {
		try {
			Day10 d = new Day10(1000, 1, 10);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test8() {
		try {
			Day10 d = new Day10(1000, 12, 10);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test9() {
		try {
			Day10 d = new Day10(1000, 1, 0);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test10() {
		try {
			Day10 d = new Day10(1000, 1, 32);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test11() {
		try {
			Day10 d = new Day10(1000, 10, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test12() {
		try {
			Day10 d = new Day10(1000, 10, 31);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test13() {
		try {
			Day10 d = new Day10(2020, 6);
			Assertions.assertEquals("2020年6月1日", d.toString());
		} catch (InvalidDayException e) {
			fail();
		}
	}

}

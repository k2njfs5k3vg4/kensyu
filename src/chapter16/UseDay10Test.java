package chapter16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UseDay10Test extends UseDay10 {

	@Test
	void test() {
		try {
			Day10 day1 = new Day10(1, 1, 1);
			Day10 day2 = new Day10(3000, 12, 31);
		} catch (InvalidDayException e) {
			fail();
		}
		//fail();
	}

	@Test
	void test2() {
		try {
			Day10 day = new Day10(0, 1, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test3() {
		try {
			Day10 day = new Day10(3001, 1, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test4() {
		try {
			Day10 day = new Day10(1, 0, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test5() {
		try {
			Day10 day = new Day10(1, 13, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test6() {
		try {
			Day10 day = new Day10(1, 1, 0);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test7() {
		try {
			Day10 day = new Day10(1, 1, 32);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}
}

package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UseDay10Test extends UseDay10 {

	@Test
	@DisplayName("最低の数字全部１が通るか")
	void test() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(1, 1, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	@DisplayName("最大の数字が通るか")
	void test2() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(3000, 12, 31);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	@DisplayName("年の数字下が通らないか")
	void test3() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(0, 12, 31);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("年の数字上が通らないか")
	void test4() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(3001, 12, 31);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("月の数字下が通らないか")
	void test5() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(1, 0, 31);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("月の数字上が通らないか")
	void test6() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(1, 13, 31);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("日の数字下が通らないか")
	void test7() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(1, 1, 0);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	@DisplayName("日の数字上が通らないか")
	void test8() {
		try {
			//fail("まだ実装されていません");
			Day10 day = new Day10(1, 12, 32);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

}

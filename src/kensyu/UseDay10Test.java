package kensyu;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class UseDay10Test extends UseDay10 {

	@Test
	void testyear() {
		try {
			UseDay10 day = new UseDay10(1, 1, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void testyear1() {
		try {
			UseDay10 day = new UseDay10(3000, 1, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void testyear2() {
		try {
			UseDay10 day = new UseDay10(0, 1, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void testyear3() {
		try {
			UseDay10 day = new UseDay10(3001, 1, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void testmonth1() {
		try {
			UseDay10 day = new UseDay10(1, 12, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void testmonth2() {
		try {
			UseDay10 day = new UseDay10(1, 0, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void testmonth3() {
		try {
			UseDay10 day = new UseDay10(1, 13, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void testdate1() {
		try {
			UseDay10 day = new UseDay10(1, 1, 31);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void testdate2() {
		try {
			UseDay10 day = new UseDay10(1, 1, 0);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void testdate3() {
		try {
			UseDay10 day = new UseDay10(1, 1, 32);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test_year_month() {
		try {
			UseDay10 day = new UseDay10(1, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test_year_month1() {
		try {
			UseDay10 day = new UseDay10(3000, 1);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test_year_month2() {
		try {
			UseDay10 day = new UseDay10(0, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test_year_month3() {
		try {
			UseDay10 day = new UseDay10(3001, 1);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test_year_month4() {
		try {
			UseDay10 day = new UseDay10(1, 12);
		} catch (InvalidDayException e) {
			fail();
		}
	}

	@Test
	void test_year_month5() {
		try {
			UseDay10 day = new UseDay10(1, 0);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

	@Test
	void test_year_month6() {
		try {
			UseDay10 day = new UseDay10(1, 13);
		} catch (InvalidDayException e) {
			return;
		}
		fail();
	}

}

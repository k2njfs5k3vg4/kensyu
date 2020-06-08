package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Day10Test{

	@Test
	void test() {
		try{Day10 d=new Day10(2020,6,8);
		Assertions.assertEquals("2020年6月8日", d.toString());
		}
		catch (InvalidDayException e) {
			Assertions.fail();
		}
	}

	void test1() {
		try {
			Day10 d=new Day10(-1,6,8);
		}
		catch (InvalidDayException e) {
			e.printStackTrace();
		}
//		Day10 d=new Day10(-1,6,8);
//		InvalidDayException ide=new InvalidDayException("年の範囲を超えました。");
//		Assertions.assertThrows(InvalidDayException.class);
	}



}

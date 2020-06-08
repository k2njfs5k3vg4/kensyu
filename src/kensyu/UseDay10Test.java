package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UseDay10Test extends UseDay10 {

	@Test
	@DisplayName("正常動作確認")
	void test() {
		try {
			Day10 day1 = new Day10(1,1,1);
			Day10 day2 = new Day10(3000,12,31);
		}catch(InvalidDayException c){
			fail();
		}
	}

	@Test
	@DisplayName("年の異常動作確認")
	void test2() {
		try {
			Day10 day1 = new Day10(0,1,1);
			Day10 day2 = new Day10(3001,12,31);
		}catch(InvalidDayException c){
			return;
		}fail();
	}

	@Test
	@DisplayName("月の異常動作確認")
	void test3() {
		try {
			Day10 day1 = new Day10(1,0,1);
			Day10 day2 = new Day10(3000,13,31);
		}catch(InvalidDayException c){
			return;
		}fail();
	}

	@Test
	@DisplayName("日の異常動作確認")
	void test4() {
		try {
			Day10 day1 = new Day10(1,1,0);
			Day10 day2 = new Day10(3000,12,32);
		}catch(InvalidDayException c){
			return;
		}fail();
	}

}

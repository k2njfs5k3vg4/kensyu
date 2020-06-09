package kensyu;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson7_1 {

	@Test
	void test() {
		IntStream ary = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Assertions.assertEquals(55, ary.sum());
	}

	@Test
	void test1() {
		IntStream ary = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		ary.forEach(i -> {
			System.out.println(i);
		});
	}

}

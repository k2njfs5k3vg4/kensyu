package kensyu;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class Lesson7_2Test extends Lesson7_2 {

	@Test
	void test() {
		IntStream array = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		array.forEach(n -> System.out.println(n));
	}

}

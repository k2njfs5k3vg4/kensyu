package kensyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class Lesson7_5Test extends Lesson7_5 {

	@Test
	void test() {
		IntStream array = IntStream.of(34, 83, 56, 74, 69);
		System.out.println(array.max().getAsInt());
	}

	@Test
	void test1() {
		IntStream array = IntStream.of(34, 83, 56, 74, 69);
		System.out.println(array.max().getAsInt());
		List<Integer> l2 = new ArrayList<Integer>();
	}
}

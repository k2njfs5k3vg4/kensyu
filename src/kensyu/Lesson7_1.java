package kensyu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson7_1 {

	@Test
	void test() {
		IntStream ary = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		IntStream ary2 = IntStream.range(1, 11);
		Assertions.assertEquals(55, ary2.sum());
	}

	@Test
	void test1() {
		IntStream ary = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(12);
		list.add(37);
		list.add(24);
		list.add(2);
		list.add(92);
		list.add(51);

		System.out.println(list.stream().mapToDouble(i -> i).sum());
		ary.forEach(System.out::println);
		//		ary.forEach(i -> {
		//			System.out.println(i);
		//		});
	}

	@Test
	void test2() {
		IntStream ary = IntStream.of(34, 83, 56, 74, 69, 92, 51);
		Assertions.assertEquals(92, ary.max().getAsInt());
	}

	@Test
	void test3() {
		IntStream ary = IntStream.of(34, 83, 56, 74, 69, 92, 51);
		ary.sorted().forEach(System.out::println);
	}

	@Test
	void test4() {
		IntStream ary = IntStream.range(1, 11);
		Assertions.assertEquals(5.5, ary.average().getAsDouble());
	}

}

package kensyu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class Lesson7_1Test {

	@Test
	void test() {
		IntStream array = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(array.sum());
	}

	@Test
	void test2() {
		IntStream array = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		array.forEach(i -> System.out.println(i));
	}

	@Test
	void test3() {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "人目の点数：");
			array[0] = scanner.nextInt();
		}
		IntStream st = Arrays.stream(array);
		System.out.println(st.max().getAsInt());
	}

}

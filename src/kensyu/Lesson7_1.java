package kensyu;

import java.util.stream.IntStream;

public class Lesson7_1 {

	public static void main(String[] args) {
		IntStream array = IntStream.range(1, 11);
		//	System.out.println(array.sum());
		int sum = array.sum();
		System.out.println(sum);
	}
}

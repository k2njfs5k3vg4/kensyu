package kensyu;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class lamdaTest {

	@Test
	@DisplayName("1から10までの数の合計")
	void test1() {
		Assertions.assertEquals(55, IntStream.range(1,11).sum());
	}

	@Test
	@DisplayName("配列のすべての要素の出力")
	void test2() {
		//		Assertions.assertEquals(7, 12, 37, 24, 2, 92, 51, IntStream.of(7, 12, 37, 24, 2, 92, 51).forEach(i -> System.out.println(i)));
		IntStream.of(7, 12, 37, 24, 2, 92, 51).forEach(i -> System.out.println(i));
	}

	@Test
	@DisplayName("最大値の出力")
	void test3() {
		//		Assertions.assertEquals(7, 12, 37, 24, 2, 92, 51, IntStream.of(7, 12, 37, 24, 2, 92, 51).forEach(i -> System.out.println(i)));
		Assertions.assertEquals(83, IntStream.of(34, 83, 56, 74, 69).max().getAsInt());
	}




}

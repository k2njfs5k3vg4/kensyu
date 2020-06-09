package kensyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LamdaTest {

	@Test
	void test1() {
		IntStream array = IntStream.range(1, 11);
		Assertions.assertEquals(55, array.sum());
	}

	@Test
	void test2() {
		IntStream array = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		array.forEach(s -> System.out.println(s));
	}

	//stream()に対してmapTointを使うとIntstream返ってくる
	//sysoutをメソッド参照を使った書き方へ変更

	@Test
	void test3() {
		IntStream array = IntStream.of(34, 83, 56, 74, 69);
		Assertions.assertEquals(83, array.max().getAsInt());
		//array.forEach(s -> System.out.println(s));

	}

	@Test
	void test4() {
		List<Integer> array = new ArrayList<Integer>();
		array.addAll(Arrays.asList(34, 83, 56, 74, 69));

		//Integerクラスはフィールドしてintを持っていて、それをIntegerにラップしている
		//ラムダ式でmapToIntの引数に指定されているインターフェースを
		//持つオブジェクトと、抽象メソッドの具体的処理を作っている
		//mapToIntは渡されたラムダ式（メソッド参照でもできる）のオブジェクトを
		//IntStream型に変えている

		IntStream array2 = array.stream().mapToInt(i -> i);
		//IntStream array2 = array.stream().mapToInt(Integer::intvalue);

		//intstreamは一度だけしか使えない。
		//array2.forEach(s -> System.out.println(s));
		Assertions.assertEquals(41, array2.max().getAsInt());

	}

	@Test
	void test5() {
		IntStream array = IntStream.of(7, 12, 37, 24, 2, 92, 51);
		array.forEach(System.out::println);
	}

}

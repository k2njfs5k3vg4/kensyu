package kensyu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComparatorImplTest {

	//	@Test
	//	void test() {
	//		//		class ComparatorImpl implements Comparator<String> {
	//		//
	//		//			@Override
	//		//			public int compare(String o1, String o2) {
	//		//				return o1.compareTo(o2);
	//		//			}
	//		//
	//		//		}
	//		//		Comparator<String> a = new Comparator<String>() {
	//		//			@Override
	//		//			public int compare(String o1, String o2) {
	//		//				return o1.compareTo(o2);
	//		//			}
	//		//		};
	//
	//		Comparator<String> c = new ComparatorImpl();
	//		Comparator<String> d = (s1, s2) -> s1.compareTo(s2);
	//		System.out.println(c.compare("ABC", "DEF"));
	//		System.out.println(d.compare("ABC", "DEF"));
	//		System.out.println(d.compare("ABC", "DEF"));
	//
	//		//lamdaMethod(new ComparatorImpl());
	//		Comparator<String> za = new ComparatorImpl();
	//		lamdaMethod(za);
	//		lamdaMethod((s1, s2) -> s1.compareTo(s2));
	//
	//		//		int i = 0;
	//		//		lamdaMethod((s1, s2) -> i);
	//	}
	@Test
	void test() {
		List<String> list = Arrays.asList("AA", "AB", "BC");
		list.stream()
				.filter(s -> s.startsWith("A"))
				.map(s -> s.toLowerCase())
				.forEach(s -> System.out.println(s));
	}

	@Test
	void test1() {
		int sum = IntStream.of(1, 2, 3).sum();
		Assertions.assertEquals(6, sum);
	}

	@Test
	void test2() {
		Assertions.assertEquals(20, IntStream.range(0, 10).filter(i -> i % 2 == 0).sum());
	}

	void lamdaMethod(Comparator<String> c) {
		System.out.println(c.compare("ABC", "DEF"));
	}
}

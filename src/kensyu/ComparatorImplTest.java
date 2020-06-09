package kensyu;

import java.util.Comparator;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComparatorImplTest {

	@Test
	void test() {
		class ComparatorImpl implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		}
		Comparator<String> a = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.compareTo(o2);
			}
		};
		Comparator<String> z = /*new*/ /*Comparator<String>()*/ /*{*/

				/*@Override*/
				/*public*/ /*int*/ /*compare*/ ( /*String*/ o1, /*String*/ o2) -> /* {*/
				// TODO 自動生成されたメソッド・スタブ
				/*return*/ o1.compareTo(o2)/*;*/
		/*}*/
		/*}*/;
		Comparator<String> c = new ComparatorImpl();
		Comparator<String> d = (s1, s2) -> s1.compareTo(s2);
		System.out.println(c.compare("ABC", "DEF"));
		System.out.println(d.compare("ABC", "DEF"));

		lambdaMethod(new ComparatorImpl());
		lambdaMethod((s1, s2) -> s1.compareTo(s2));
	}

	void lambdaMethod(Comparator<String> c) {
		System.out.println(c.compare("ABC", "DEF"));
	}

	@Test
	void test2() {
		Assertions.assertEquals(45, IntStream.range(0, 10).sum());
	}

}

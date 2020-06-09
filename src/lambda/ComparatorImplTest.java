package lambda;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class ComparatorImplTest {

	@Test
	void test() {
		//fail("まだ実装されていません");
		class ComparatorImpl implements Comparator<String> {
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		}
		Comparator<String> z = (s1, s2) -> s1.compareTo(s2)

		;

		Comparator<String> c = new ComparatorImpl();
		Comparator<String> d = (s1, s2) -> s1.compareTo(s2);
		System.out.println(c.compare("ABC", "DEF"));
		System.out.println(d.compare("ABC", "DEF"));

		lambdaMethod(new ComparatorImpl());
		Comparator<String> za = new ComparatorImpl();
		lambdaMethod(za);
		lambdaMethod((s1, s2) -> s1.compareTo(s2));
		int i = 0;
		lambdaMethod((s1, s2) -> i);

	}

	void lambdaMethod(Comparator<String> c) {
		System.out.println(c.compare("ABC", "DEF"));
	}

}

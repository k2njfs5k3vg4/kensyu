package kensyu;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Arraylist3Test {

	@Test
	void test() {
		List<String> l = new ArrayList<String>();
		l.add("りんご");
		l.add("みかん");
		l.add("めろん");
		l.add("いちご");
		Assertions.assertEquals("りんご", l.get(0));
		Assertions.assertEquals("みかん", l.get(1));
		Assertions.assertEquals("めろん", l.get(2));
		Assertions.assertEquals("いちご", l.get(3));
	}

	@Test
	void test1() {
		List<String> l = new ArrayList<String>();
		l.add("りんご");
		l.add("みかん");
		l.add("めろん");
		l.add("いちご");
		l.remove(2);
		Assertions.assertEquals("りんご", l.get(0));
		Assertions.assertEquals("みかん", l.get(1));
		Assertions.assertEquals("いちご", l.get(2));
	}
}

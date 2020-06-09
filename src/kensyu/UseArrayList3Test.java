package kensyu;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UseArrayList3Test {

	@Test
	void test() {
		List<String> list = new ArrayList<String>();
		list.add("りんご");
		list.add("みかん");
		list.add("メロン");
		list.add("いちご");
		Assertions.assertEquals("りんご", list.get(0));
		Assertions.assertEquals("みかん", list.get(1));
		Assertions.assertEquals("メロン", list.get(2));
		Assertions.assertEquals("いちご", list.get(3));
	}

	@Test
	void test2() {
		List<String> list = new ArrayList<String>();
		list.add("りんご");
		list.add("みかん");
		list.add("メロン");
		list.add("いちご");
		list.remove(2);
		Assertions.assertEquals("りんご", list.get(0));
		Assertions.assertEquals("みかん", list.get(1));
		Assertions.assertEquals("いちご", list.get(2));
	}

}

package kensyu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrayListTest {

	@Test
	void test() {
		List<String> list = new ArrayList<String>();
		list.add("リンゴ");
		list.add("みかん");
		list.add("メロン");
		list.add("イチゴ");

		Assertions.assertEquals("リンゴ", list.get(0));
		Assertions.assertEquals("みかん", list.get(1));
		Assertions.assertEquals("メロン", list.get(2));
		Assertions.assertEquals("イチゴ", list.get(3));
	}

	@Test
	void test2() {
		List<String> list = new ArrayList<String>();
		list.add("リンゴ");
		list.add("みかん");
		list.add("メロン");
		list.add("イチゴ");

		list.remove(2);
		Assertions.assertEquals("リンゴ", list.get(0));
		Assertions.assertEquals("みかん", list.get(1));
		Assertions.assertEquals("イチゴ", list.get(2));
	}

	@Test
	void test3() {
		Map<String, Person3> map = new HashMap<String, Person3>();

		map.put("A13", new Person3("木村"));
		map.put("A12", new Person3("山田"));
		map.put("A14", new Person3("田中"));

		Assertions.assertEquals("木村", map.get("A13").getName());
		Assertions.assertEquals("山田", map.get("A12").getName());
		Assertions.assertEquals("田中", map.get("A14").getName());
	}

	@Test
	void test4() {
		Map<String, Person3> map = new HashMap<String, Person3>();

		map.put("A13", new Person3("木村"));
		map.put("A12", new Person3("山田"));
		map.put("A14", new Person3("田中"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			map.get(key).introduce();
		}

	}

}

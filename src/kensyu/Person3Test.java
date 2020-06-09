package kensyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Person3Test {

	/*@Test
	@DisplayName("ArrayListの中身を確認")
	void test() {
		List<String> list = new ArrayList<String>();
		list.add("リンゴ");
		list.add("みかん");
		list.add("メロン");
		list.add("いちご");
		for (String str : list) {
			System.out.println(str);
		}
		//fail("まだ実装されていません");
	}
	
	@Test
	@DisplayName("ArrayListの中身から２つ目の削除を確認")
	void test2() {
		List<String> list = new ArrayList<String>();
		list.add("リンゴ");
		list.add("みかん");
		list.add("メロン");
		list.add("いちご");
		list.remove(2);
		for (String str : list) {
			System.out.println(str);
		}
		//fail("まだ実装されていません");
	}*/
	@Test
	@DisplayName("コンストラクタでnameを設定する")
	void test3() {
		Person3 p = new Person3("木村");
		Assertions.assertEquals("木村", p.getName());
	}

	@Test
	@DisplayName("Setterでnameを設定する")
	void test4() {
		Person3 p = new Person3();
		p.setName("木村");
		Assertions.assertEquals("木村", p.getName());
	}

	@Test
	@DisplayName("自己紹介する")
	void test5() {
		Person3 p = new Person3("木村");
		Assertions.assertEquals("私は木村と申します。", p.introduce());
	}

	@Test
	@DisplayName("Mapの社員番号（Key）とPerson3をペアにして自己紹介する")
	void test6() {
		Map<String, Person3> map = new HashMap<String, Person3>();
		map.put("A13", new Person3("木村"));
		map.put("A12", new Person3("山田"));
		map.put("A14", new Person3("田中"));
		Set<String> keys = map.keySet();
		String[] out = new String[3];
		for (String key : keys) {
			if (key.contentEquals("A13"))
				Assertions.assertEquals("私は木村と申します。", map.get(key).introduce());
			if (key.contentEquals("A12"))
				Assertions.assertEquals("私は山田と申します。", map.get(key).introduce());
			if (key.contentEquals("A14"))
				Assertions.assertEquals("私は田中と申します。", map.get(key).introduce());
		}

	}
}

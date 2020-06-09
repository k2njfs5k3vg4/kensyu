package kensyu;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	void test() {
		Map<String, Person3> map = new HashMap<String, Person3>();
		map.put("A12", new Person3("山田"));
		map.put("A13", new Person3("木村"));
		map.put("A14", new Person3("田中"));

		Assertions.assertEquals("私は山田と申します。", map.get("A12").introduce());
		Assertions.assertEquals("私は木村と申します。", map.get("A13").introduce());
		Assertions.assertEquals("私は田中と申します。", map.get("A14").introduce());
	}

}

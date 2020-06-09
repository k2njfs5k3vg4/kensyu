package kensyu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Person3Test extends Person3 {

	@Test
	void test() {
		//		fail("まだ実装されていません");
		Map<String, Person3> p = new HashMap<String, Person3>();

		p.put("A13", new Person3("木村"));
		p.put("A12", new Person3("山田"));
		p.put("A14", new Person3("田中"));

		Set<String> keys = p.keySet();

		Assertions.assertEquals("木村", p.get("A13").getName());
		Assertions.assertEquals("山田", p.get("A12").getName());
		Assertions.assertEquals("田中", p.get("A14").getName());
	}

}

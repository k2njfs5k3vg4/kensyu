package kensyu;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapTest extends Person3{

	@Test
	@DisplayName("Mapで格納できてるか")
	void test() {
		Map<String, Person3> map = new HashMap<String, Person3>();

		map.put("A13",new Person3("木村"));
		map.put("A12",new Person3("山田"));
		map.put("A14",new Person3("田中"));

		Assertions.assertEquals("木村",map.get("A13").getName());
		Assertions.assertEquals("山田",map.get("A12").getName());
		Assertions.assertEquals("田中",map.get("A14").getName());
	}

}

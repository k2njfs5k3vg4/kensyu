package kensyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UseBookProductTest extends UseBookProduct {

	@Test
	void test() {
		UseBookProduct ubp1 = new UseBookProduct();
		ubp1.price = 1000;
		Assertions.assertEquals(1000, ubp1.price);
	}

	@Test
	void test2() {
		UseBookProduct ubp1 = new UseBookProduct();
		ubp1.title = "刑事コロンボ";
		Assertions.assertEquals("刑事コロンボ", ubp1.title);
	}

	@Test
	void test3() {
		UseBookProduct ubp1 = new UseBookProduct();
		ubp1.author = "ABC出版";
		Assertions.assertEquals("ABC出版", ubp1.author);
	}

	@Test
	void test4() {
		UseBookProduct ubp1 = new UseBookProduct();
		ubp1.title = "刑事コロンボ";
		Assertions.assertEquals("刑事コロンボ", ubp1.getTitle());
	}

	@Test
	void test5() {
		UseBookProduct ubp1 = new UseBookProduct();
		ubp1.author = "ABC出版";
		Assertions.assertEquals("ABC出版", ubp1.getAuthor());
	}

}

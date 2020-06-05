package kensyu;

public class BookProduct extends Product {

	static String title;
	static String publisher;


	public String showBook() {
		return "タイトル："+title+", 出版社："+publisher+", "+super.showPrice();
	}

}

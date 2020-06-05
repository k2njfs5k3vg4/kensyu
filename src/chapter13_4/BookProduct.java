package chapter13_4;

public class BookProduct extends Product {

	public String title;
	public String syuppan;

	public Object showBook() {
		return "タイトル：" + this.title + " 出版社：" + this.syuppan + " 価格：" + super.price;
	}

}

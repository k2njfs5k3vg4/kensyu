package kensyu;

class UseBookProduct extends Product {

	String title;
	String author;

	public String getTitle() {
		// TODO 自動生成されたメソッド・スタブ
		return title;
	}

	public String getAuthor() {
		// TODO 自動生成されたメソッド・スタブ
		return author;
	}

	public void showTitle() {
		System.out.println("タイトルは" + this.title + "です");
	}

	public void showAuthor() {
		System.out.println("出版社は" + this.author + "です");
	}

}

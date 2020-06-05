package kensyu;

public class BookProduct extends Product {

	private String title;
	private String publisher;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return this.title;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public String showBook() {
		return this.title + " " + this.publisher + " " + getPrice();
	}

}

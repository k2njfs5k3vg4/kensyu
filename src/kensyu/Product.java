package kensyu;

public class Product {

	int price;

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public String showPrice() {
		return "価格:" + this.price + "円";
	}

}

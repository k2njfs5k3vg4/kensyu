package kensyu;

public class Person3 {

	private String name;

	public Person3(String name) {
		this.name = name;
	}

	public Person3() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String introduce() {
		System.out.println("私は" + name + "と申します。");
		return "私は" + name + "と申します。";
	}

}
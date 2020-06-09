package kensyu;

public class Person3 {
	private String name;

	public Person3() {
	}

	public Person3(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String introduce() {
		return "私は" + name + "と申します。";
	}
}

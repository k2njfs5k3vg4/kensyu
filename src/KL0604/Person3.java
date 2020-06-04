package KL0604;

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
		return this.name;
	}

	public String introduce() {
		return "私は" + this.name + "と申します。";
	}

}

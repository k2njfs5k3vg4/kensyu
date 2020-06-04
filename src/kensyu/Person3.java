package kensyu;

public class Person3 {

	private String name;

	public Person3(String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = name;
	}

	public Person3() {
	}

	public void setName(String name) {
		// TODO 自動生成されたメソッド・スタブ
		this.name = name;
	}

	public Object getName() {
		// TODO 自動生成されたメソッド・スタブ
		return name;
	}

	public Object introduce() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("私は" + name + "と申します。");
		return "私は" + name + "と申します。";
	}

}

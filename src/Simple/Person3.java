package Simple;

class Person3 {

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
		// TODO 自動生成されたメソッド・スタブ
		return this.name;
	}

	public void introduce() {
		System.out.println("私は" + name + "と申します。");
	}

}

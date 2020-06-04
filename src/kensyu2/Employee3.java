package kensyu2;

public class Employee3 extends Person3 {

	private String department;

	public Employee3(String name, String department) {
		super(name);
		this.department = department;
	}

	public Employee3() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String introduce() {
		String s = super.introduce();
		return s + " 所属は" + department+ "です。";
	}
}

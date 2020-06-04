package kensyu;

public class Employee3 extends Person3 {

	public String department;

	public Employee3(String name, String department) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name);
		this.department = department;
	}

	public Employee3() {
	}

	public void setDepartment(String department) {
		// TODO 自動生成されたメソッド・スタブ
		this.department = department;
	}

	public String getDepartment() {
		// TODO 自動生成されたメソッド・スタブ
		return department;
	}

	public String introduce() {
		super.introduce();
		System.out.println("所属は" + department + "です。");
		return "所属は" + department + "です。";
	}

}

package KL0604;

public class Employee3 extends Person3 {
	private String department;

	public Employee3(String name, String department) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(name);
		this.department = department;
	}

	public Employee3() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setDepartment(String department) {
		// TODO 自動生成されたメソッド・スタブ
		this.department = department;
	}

	public String getDepartment() {
		// TODO 自動生成されたメソッド・スタブ
		return this.department;
	}

	public String introduce() {
		return super.introduce() + department + "の" + this.getName() + "です。";
	}

}

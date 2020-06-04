package kensyumaster;

public class Employee3 extends Person3 {

	private String department;

	public Employee3() {
	}

	public Employee3(String name, String department) {
		super(name);
		this.department = department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Object getDepartment() {
		return department;
	}

	public String introduce() {
		return super.introduce() + "\n" + "所属は" + department + "です。";
	}

}

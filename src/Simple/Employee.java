package Simple;

class Employee extends Person3 {
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(String name, String department) {
		super(name);
		this.department = department;
	}

	public Employee() {
	}

	public void introduce() {
		super.introduce();
		System.out.println("所属は" + department + "です。");
	}
}

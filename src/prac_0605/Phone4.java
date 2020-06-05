package prac_0605;

public class Phone4 {

	private String no;

	public Phone4(String no) {
		this.no = no;
	}

	public Phone4() {

	}

	public String getNo() {
		return this.no;
	}

	public void tell(String to) {
		System.out.println(this.no + "から" + to + "へ電話しました。");
	}

	public void setNo(String no) {
		this.no = no;
	}

}
package kensyumaster;

public class Phone4 {

	private String no;

	public Phone4(String no) {
		this.no = no;
	}

	public Phone4() {
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Object getNo() {
		return this.no;
	}

	public Object getTelInfo(String to) {
		return no + "から" + to + "へ電話しました。";
	}

}

package kensyu;

class Phone {

	private String no;

	public Phone(String no) {
		this.no = no;
	}

	public Phone() {

	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getNo() {
		return this.no;
	}

	public void tel(String to) {
		System.out.println(no + "から" + to + "へ電話しました");
	}

}
package Simple;

class Phone4 {

	private String no;

	public Phone4(String no) {
		this.no = no;
	}

	public Phone4() {

	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getNo() {
		// TODO 自動生成されたメソッド・スタブ
		return this.no;
	}

	public void tel(String to) {
		System.out.println(no + "から" + to + "へ電話しました");
	}

}

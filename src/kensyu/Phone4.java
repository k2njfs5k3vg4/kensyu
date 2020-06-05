package kensyu;

public class Phone4 {

	private String no;

	public Phone4(String no) {
		this.no = no;
	}

	public Phone4() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String tel(String to) {
		return no +"から" + to + "へ電話しました。";
	}

}

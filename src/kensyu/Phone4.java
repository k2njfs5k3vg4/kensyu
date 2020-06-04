package kensyu;

public class Phone4 {

	private String no;

	public Phone4() {
	}

	public Phone4(String no) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.no = no;
	}

	public void setNo(String no) {
		// TODO 自動生成されたメソッド・スタブ
		this.no = no;
	}

	public Object getNo() {
		// TODO 自動生成されたメソッド・スタブ
		return no;
	}

	public Object tel(String string) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(no + "から" + string + "へ電話しました。");
		return string;
	}

}

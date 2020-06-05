package kensyu;

public class HandyPhone4 extends Phone4 {

	private String mailAddress;

	public HandyPhone4(String no, String add) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(no);
		this.mailAddress = add;
	}

	public HandyPhone4() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getMailAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return mailAddress;
	}

	public void setMailAddress(String string) {
		// TODO 自動生成されたメソッド・スタブ
		this.mailAddress = string;

	}

	public String mail(String string) {
		// TODO 自動生成されたメソッド・スタブ
		return mailAddress + "から" + string + "へメールしました。";
	}

	public Object info() {
		// TODO 自動生成されたメソッド・スタブ
		return "電話番号=" + getNo() + " メールアドレス=" + mailAddress;
	}

}

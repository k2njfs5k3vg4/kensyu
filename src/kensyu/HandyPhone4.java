package kensyu;

public class HandyPhone4 extends Phone4 {

	public String mailAddress;

	public HandyPhone4(String no, String mailAddress) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(no);
		this.mailAddress = mailAddress;
	}

	public HandyPhone4() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setMailAddress(String mailAddress) {
		// TODO 自動生成されたメソッド・スタブ
		this.mailAddress = mailAddress;
	}

	public Object getMailAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return mailAddress;
	}

	public Object mail(String string) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(mailAddress + "から" + string + "へメールしました。");
		return string;
	}

	public Object info() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("電話番号=" + getNo() + "メールアドレス=" + mailAddress);
		return null;
	}

}

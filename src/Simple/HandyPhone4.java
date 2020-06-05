package Simple;

public class HandyPhone4 extends Phone4 {

	public String mailAddress;

	public HandyPhone4(String no, String mailAddress) {
		super(no);
		this.mailAddress = mailAddress;
	}

	public HandyPhone4() {
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public void info() {
		System.out.println("電話番号=" + getNo() + ", メールアドレス=" + mailAddress);
	}

	public void mail(String to) {
		System.out.println(mailAddress + "から" + to + "へ電話しました");

	}

}

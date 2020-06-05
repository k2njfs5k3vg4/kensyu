package kensyu;

public class HandyPhone extends Phone {

	public String mailAddress;

	public HandyPhone(String no, String mailAddress) {
		super(no);
		this.mailAddress = mailAddress;
	}

	public HandyPhone() {
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
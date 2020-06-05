package chapter14_2;

public class HandyPhone {

	//Phoneを継承しないで行う。
	private String no;

	private String mailAddress;

	public HandyPhone(String no, String mailAddress) {
		this.no = no;
		this.mailAddress = mailAddress;
	}

	HandyPhone() {
	}

	String mail(String to) {
		return this.mailAddress + "から" + to + "へメールしました。";
	}

	String info() {
		return "電話番号=" + this.no + ", メールアドレス=" + this.mailAddress;
	}

	public void setMailaddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

}

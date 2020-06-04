package kensyumaster;

public class HandyPhone4 extends Phone4{

	private String mailAddress;

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
		return mailAddress;
	}

	public String mail(String to) {
		return mailAddress + "から" +to + "へメールしました。";
	}

	public String info() {
		return "電話番号="+getNo()+", メールアドレス="+mailAddress;
	}


}

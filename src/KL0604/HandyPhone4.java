package KL0604;

public class HandyPhone4 extends Phone4 {
	private String mailAddress;

	public HandyPhone4(String no, String mailAddress) {
		// TODO 自動生成されたコンストラクター・スタブ
		super(no);
		this.mailAddress = mailAddress;

	}

	public HandyPhone4() {

	}

	public void setMailAddress(String mailAddress) {
		// TODO 自動生成されたメソッド・スタブ
		this.mailAddress = mailAddress;
	}

	public String getMailAddress() {
		// TODO 自動生成されたメソッド・スタブ
		return mailAddress;
	}
}

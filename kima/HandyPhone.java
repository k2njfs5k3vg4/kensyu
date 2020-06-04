package murano_kima.kima;

class HandyPhone extends Phone {

	String mailAddress;

	public String getAddress() {
		return this.mailAddress;
	}

	public void mail(String to) {
		System.out.println(this.mailAddress + "から" + to + "へ電話しました。");
	}

}

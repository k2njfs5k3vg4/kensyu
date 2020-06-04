package murano_kima.kima;

public class Phone {

	String no;

	public String getTel() {
		return this.no;
	}

	public void tel(String to) {
		System.out.println(this.no + "から" + to + "へ電話しました。");
	}

}

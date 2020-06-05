package prac_0605;

public class UseSmartPhone {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SmartPhone sp = new SmartPhone();
		sp.setMailAddress("aaa@bbb.com");
		sp.setNo("123456");

		sp.tell("78910");
		sp.mail("ccc@ddd.com");

		sp.play();
		sp.stop();
		sp.upload();
		sp.download();

	}

}

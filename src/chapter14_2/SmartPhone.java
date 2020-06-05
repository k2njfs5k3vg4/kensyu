package chapter14_2;

public class SmartPhone extends HandyPhone implements Remotable, Audio {
	public SmartPhone(String no, String mailAddress) {
		super(no, mailAddress);
	}

	SmartPhone() {
	}

	public String upload() {
		return "スマートフォンでデータをアップロードしました。";
	}

	public String download() {
		return "スマートフォンでデータをダウンロードしました。";
	}

	public String play() {
		return "スマートフォンで音楽を再生しました。";
	}

	public String stop() {
		return "スマートフォンで音楽を停止しました。";
	}

}

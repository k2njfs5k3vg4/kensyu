package kensyu;

public class SmartPhone extends HandyPhone implements Audio, Remotable {
	public SmartPhone(String mailAddress, String no) {
		super(no, mailAddress);
	}

	public SmartPhone() {
	}

	public String play() {
		return "スマートフォン 再生";
	}

	public String stop() {
		return "スマートフォン 停止";
	}

	public String upload() {
		return "スマートフォン アップロード";
	}

	public String download() {
		return "スマートフォンダウンロード";

	}

}

package kensyu;

class SmartPhone extends HandyPhone4 implements Remotable, Audio {

	public SmartPhone(String no, String mailAddress) {
		super(no, mailAddress);
	}

	@Override
	public String play() {
		return "音楽をスタートしました";
	}

	@Override
	public String stop() {
		return "音楽をストップしました";
	}

	@Override
	public String upload(String name) {
		return name + "へアップロードしました";
	}

	@Override
	public String download(String name) {
		return name + "からダウンロードしました";
	}

}

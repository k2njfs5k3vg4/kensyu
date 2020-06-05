package kensyu;

public class SmartPhone extends HandyPhone4 implements Audio, Remotable{

	public SmartPhone(String no, String add) {
		super(no, add);
	}

	public SmartPhone() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public String upload() {
		return "スマホでデータをアップロード";
	}

	@Override
	public String download() {
		return "スマホでデータをダウンロード";
	}

	@Override
	public String play() {
		return "スマホで音楽を再生";
	}

	@Override
	public String stop() {
		return "スマホで音楽を停止";
	}


}

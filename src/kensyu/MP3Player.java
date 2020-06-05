package kensyu;

public class MP3Player implements Audio {

	public MP3Player() {
	}

	@Override
	public String play() {
		return "MP3を再生します。";
	}

	@Override
	public String stop() {
		return "MP3を停止します。";
	}

}

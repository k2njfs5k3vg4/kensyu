package kensyu;

class Stereo implements Audio {

	@Override
	public String play() {
		return "ステレオを再生します";

	}

	@Override
	public String stop() {
		return "ステレオを停止します";
	}

}

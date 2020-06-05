package kensyu;

public class Truck extends Car implements Audio, Carriable {

	public String play() {
		return "カーステレオを再生";
	}

	public String stop() {
		return "カーステレオを停止";
	}

	public String carry() {
		return "トラックで運ぶ";
	}

}

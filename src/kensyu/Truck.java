package kensyu;

public class Truck extends Car implements Audio, Carriable {

	@Override
	public String carry() {
		return "トラックで荷物を運ぶ";
	}

	@Override
	public String play() {
		return "カーステレオを再生";
	}

	@Override
	public String stop() {
		return "カーステレオを停止";
	}


}

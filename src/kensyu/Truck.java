package kensyu;

class Truck extends Car3 implements Audio, Cariable {

	@Override
	public String play() {
		return "カーステレオを再生します。";
	}

	@Override
	public String stop() {
		return "カーステレオを停止します。";
	}

	@Override
	public String carry() {
		return "トラックで荷物を運びます。";
	}

}

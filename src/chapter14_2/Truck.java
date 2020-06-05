package chapter14_2;

public class Truck extends Car implements Audio, Carriable {
	public String play() {
		return "カーステレオを再生します";
	}

	public String stop() {
		return "カーステレオを停止します";
	}

	public String carry() {
		return "トラックで荷物を運びます";
	}

}

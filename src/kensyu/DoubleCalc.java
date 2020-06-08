package kensyu;

public class DoubleCalc {

	Double[] doubles = new Double[2];

	public DoubleCalc() {

	}

	public DoubleCalc(String[] strings) throws NumberFormatException, inValidStrings {
		if (strings.length != 2) {
			throw new inValidStrings("引数を2つ用意してください");
		}

		for (int i = 0; i < strings.length; i++) {
			this.doubles[i] = Double.parseDouble(strings[i]);
		}

	}

}

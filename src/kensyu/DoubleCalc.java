package kensyu;

public class DoubleCalc {

	private Double[] doubles = new Double[2];

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

	public double Addition() {
		int sum = 0;
		for (double num : this.doubles) {
			sum += num;
		}
		return sum;
	}

	public Double[] getDoubles() {
		return doubles;
	}
}

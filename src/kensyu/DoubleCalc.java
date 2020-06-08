package kensyu;

public class DoubleCalc {

	private double[] doubles;

	public DoubleCalc() {

	}

	public DoubleCalc(String[] strings) throws NumberFormatException, inValidStrings {

		if (strings.length < 2) {
			throw new inValidStrings("引数を2つ以上用意してください");
		}

		else {
			doubles = new double[strings.length];
			for (int i = 0; i < strings.length; i++) {
				this.doubles[i] = Double.parseDouble(strings[i]);
			}
		}
	}

	public double Addition() {
		double sum = 0;
		for (double num : this.doubles) {
			sum += num;
		}
		return Math.floor(sum * 10) / 10;
	}

	public double[] getDoubles() {
		return doubles;
	}
}

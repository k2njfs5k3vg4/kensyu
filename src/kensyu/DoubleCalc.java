package kensyu;

public class DoubleCalc {

	public Double doubleCalc(String[] num) throws HikisuException, NumberFormatException {
		Double sum = 0.0;

		if (num.length < 2) {
			throw new HikisuException("引数の数が足りません。");
		}

		try {
			for (int i = 0; i < num.length; i++) {
				sum += Double.parseDouble(num[i]);
			}
		} catch (NumberFormatException e) {
			throw new NumberFormatException("正しい値を入れろ");
		}
		return sum;
	}

}

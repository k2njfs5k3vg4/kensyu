package chapter16;

public class DoubleCalc {

	public double plus(String[] num) throws InvalidDoubleCalcException {

		if (num.length < 2) {
			throw new InvalidDoubleCalcException("小数を二つ以上入力してください。");
		}

		double[] d = new double[num.length];
		try {
			for (int i = 0; i < num.length; i++) {
				d[i] = Double.parseDouble(num[i]);
				if (d[i] % 1 == 0) {
					throw new InvalidDoubleCalcException("入力された値は小数ではありません。");
				}

			}

		} catch (NumberFormatException e) {
			throw new InvalidDoubleCalcException("入力された値は小数ではありません。");
		}

		double sum = 0;
		for (double data : d) {
			sum += data;
		}
		return sum;

	}

	public static void main(String[] args) {

	}

}

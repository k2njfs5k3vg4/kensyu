package kensyu;

public class DoubleCalc {

	public Object doubleCalc(String[] num) throws HikisuException, NumberFormatException {
		if (num.length < 2) {
			throw new HikisuException("引数の数が足りません。");
		}
		for (int i = 0; i < num.length; i++) {
			try {
				Double.parseDouble(num[i]);
			} catch (NumberFormatException e) {
				System.out.println("正しい値を入れろ");
				e.printStackTrace();

			}
		}
		return Double.parseDouble(num[0]) + Double.parseDouble(num[1]);
	}

}

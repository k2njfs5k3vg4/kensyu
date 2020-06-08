package kensyu;

public class DoubleCale {

	String[] s = new String[100];

	public DoubleCale(String[] s) throws CalcExpection {
		//		if ((s2 == "") || (s1 == "")) {
		//			throw new CalcExpection("dataが足りない");
		//		}
		//		if ((s1.contains(".") == false) || (s2.contains(".") == false)) {
		//			throw new CalcExpection("小数ではない");
		//		}

		//		this.s1 = s1;
		//		this.s2 = s2;
		if (s.length < 2) {
			throw new CalcExpection("引数の数が足りない");
		}
		for (int i = 0; i < s.length; i++) {
			try {
				Double.parseDouble(s[i]);
			} catch (NumberFormatException e) {
				System.out.println("小数ではない");
			}
		}

	}

	double calc(String[] s) {
		// TODO 自動生成されたメソッド・スタブ
		double max = 0;
		for (String a : s) {
			double b = Double.parseDouble(a);
			max += b;
		}
		return max;
	}

	public DoubleCale() {

	}

}

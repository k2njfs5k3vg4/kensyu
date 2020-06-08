package kensyu;

public class DoubleCalc {

	private double[] arr;

	public DoubleCalc(double[] arr) throws IllegalArg_Exception{
		if (arr.length < 2) {
			throw new  IllegalArg_Exception("引数が2未満です");
		}

//		if () {
//			throw new  IllegalArg_Exception("引数がdoubleではありません");
//		}

		this.arr = arr;

	}

	public Double add() {
		double sum = 0;
		for (double data : arr) {
			sum += data;
		}
		return sum;
	}

}

package kensyu;

public class DoubleCalc {

	private double[] arr;

	public DoubleCalc(String[] str_arr) throws IllegalArg_Exception{
		if (str_arr.length < 2) {
			throw new  IllegalArg_Exception("引数が2未満です");
		}
		double arr[] = new double[str_arr.length];
		for (int i = 0; i<str_arr.length; i++) {
			try{
				arr[i] = Double.parseDouble(str_arr[i]);
			}catch(NumberFormatException e){
				throw new  NumberFormatException("引数が小数ではありません");
//				System.out.println("小数を入力してください");
//				return;
			}

	}
			this.arr = arr;
		}

	public DoubleCalc(double[] arr) throws IllegalArg_Exception{
		if (arr.length < 2) {
			throw new  IllegalArg_Exception("引数が2未満です");
		}
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

package kensyu;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			int i = 10, j= 0;
			int k = i/j;
			System.out.println("K="+k);
		}catch(ArithmeticException e) {
			System.out.println("エラー：0で割りました");
			e.printStackTrace();
		}
		System.out.println("main終了");

	}

}

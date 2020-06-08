package kensyu;

class ExceptionTest4 {
	public static void main(String args[]) {

		try {
			System.out.println("try文中");
			int[] a = new int[2];
			a[0] = 5;
			a[1] = 4;
			a[2] = 1;
			int i = 10, j = 0;
			int k = i / j;
			System.out.println("K=" + k);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("catch文中");
			System.out.println("エラーが発生しました");
			e.printStackTrace();

		} finally {
			System.out.println("finally文中");
		}
		System.out.println("プログラム終了");

	}

}

//} catch (ArithmeticException e) {
//			System.out.println("catch文中");
//			System.out.println("エラー：0で除算しました");
//			e.printStackTrace();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("catch文中");
//			System.out.println("配列のインデックスをオーバーしました");
//			e.printStackTrace();

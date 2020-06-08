package kensyu;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			int i=10;
					int j=0;
			int k=i/j;
			System.out.println("K=;"+k);
		}
		catch(ArithmeticException e){
			System.out.println("error:divide by 0");
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

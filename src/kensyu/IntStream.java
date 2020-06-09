package kensyu;

import java.util.Arrays;
import java.util.Scanner;

public class IntStream {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int[] points = new int[5];

		for(int i=1; i<=points.length; i++) {
			System.out.print(i+"人目の点数：");
			int p = scan.nextInt();
			points[i-1]=p;
		}
		java.util.stream.IntStream stream1 = Arrays.stream(points);
		System.out.println("最高得点は"+stream1.max().getAsInt());

	}

}

package kensyu;

public class UsePoint {

	public static void main(String[] args) {
		Point[] point = new Point[4];
		point[0] = new Point(3, 9);
		point[1] = new ColorPoint(12, -3, "RED");
		point[2] = new Point(56, 2);
		point[3] = new ColorPoint(7, -28, "BLUE");

		for (Point date : point) {
			System.out.println(date.getPointInfo());
			System.out.println();
		}
	}

}

package prac_0605;

public class UseFigure {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Figure[] f = { new Circle(4), new Triangle(3, 6), new Square(3, 6) };
		for (Figure figure : f) {
			if (figure instanceof Circle) {
				Circle f2 = (Circle) figure;
				System.out.println(f2.getArea());
			} else if (figure instanceof Triangle) {
				Triangle f2 = (Triangle) figure;
				System.out.println(f2.getArea());
			} else if (figure instanceof Square) {
				Square f2 = (Square) figure;
				System.out.println(f2.getArea());
			}
		}

	}

}

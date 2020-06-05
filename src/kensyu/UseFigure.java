package kensyu;

public class UseFigure {

	public static void main(String[] args) {
		Figure[] fig = new Figure[3];
		fig[0] = new Circle(5);
		fig[1] = new Triangle(2, 4);
		fig[2] = new Square(5, 4, 6);

		for (Figure data : fig) {
			System.out.println(data.getArea());
		}
	}

}

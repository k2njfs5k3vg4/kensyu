package kensyu;

public class UseFigure {

	public static void main(String[] args) {
		Figure[] figures = new Figure[] {
				new Circle(3), new Triangle(2,4),new Square(5,2)
		};

		for (Figure figure : figures) {
			System.out.println(figure.Calc());
		}
	}

}

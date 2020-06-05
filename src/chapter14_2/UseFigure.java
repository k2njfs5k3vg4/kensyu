package chapter14_2;

public class UseFigure {

	public static void main(String[] args) {
		Figure[] fs = { new Circle(2), new Triangle(2, 3), new Square(2, 3) };
		for (Figure figure : fs) {
			System.out.println("面積：" + figure.areaCalc());
		}
	}

}

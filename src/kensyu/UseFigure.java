package kensyu;

public class UseFigure {

	public static void main(String[] args) {
		Figure[] f = new Figure[] { new Circle(1), new Triangle(1, 2), new Square(1, 2) };
		for (int i = 0; i < f.length; i++) {
			System.out.println("図形" + (i + 1) + "の面積：" + f[i].area());
		}
	}
}
